package edu.sru.kearney.controlgui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

import com.aldebaran.qi.helper.proxies.ALMotion;

/**
 * Walk Panel Last Edited, 11/30/2015
 * 
 * @author Zachary Kearney
 */

public class NaoWalkPanel extends NaoPanel implements NaoPanelInterface {

	/**
	 * Create the panel.
	 */
	private float x, y, theta;
	private ALMotion motion;
	private boolean isMoving;
	private Object moveSettings;
	private NaoWalkSettingsPanel naoWalkSettingsPane;
	private JTextPane textPane, txtpnWForward;
	private JButton btnStop;
	private JTextPane txtpnX;
	private JTextPane txtpnY;
	private JTextPane txtpnZ;

	public NaoWalkPanel() {

		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(20, 151, 139, 70);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				try {
					execute(ke.getKeyCode());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		textPane.setBackground(SystemColor.inactiveCaption);
		panel.add(textPane);

		txtpnWForward = new JTextPane();
		txtpnWForward.setEditable(false);
		txtpnWForward.setBackground(SystemColor.menu);
		txtpnWForward.setText(
				"W- Forward\r\nS - Backward\r\nA - Rotate Left\r\nD - Rotate Right\r\nQ- Strafe Left\r\nE - Strafe Right\r\nSpace - Initiate Movement");
		txtpnWForward.setBounds(10, 11, 139, 129);
		add(txtpnWForward);

		btnStop = new JButton("Stop Motion");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnStop.setBounds(29, 358, 120, 23);
		add(btnStop);

		naoWalkSettingsPane = new NaoWalkSettingsPanel();
		naoWalkSettingsPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		naoWalkSettingsPane.setBounds(182, 11, 264, 370);
		add(naoWalkSettingsPane);

		txtpnX = new JTextPane();
		txtpnX.setEditable(false);
		txtpnX.setBackground(SystemColor.menu);
		txtpnX.setText("X: " + x);
		txtpnX.setBounds(29, 243, 120, 20);
		add(txtpnX);

		txtpnY = new JTextPane();
		txtpnY.setEditable(false);
		txtpnY.setBackground(SystemColor.menu);
		txtpnY.setText("Y:" + y);
		txtpnY.setBounds(29, 274, 120, 20);
		add(txtpnY);

		txtpnZ = new JTextPane();
		txtpnZ.setEditable(false);
		txtpnZ.setBackground(SystemColor.menu);
		txtpnZ.setText("Z:" + theta);
		txtpnZ.setBounds(29, 305, 120, 20);
		add(txtpnZ);

	}

	void updateParams(int keyCode) throws Exception {

		switch (keyCode) {
		case 87: // w
			if (x <= .8f) {
				x = x + .2f;
			}
			move();
			break;
		case 83:
			if (x >= -.8f) {
				x = x - .2f;// s
			}
			move();
			break;
		case 68:
			if (theta >= -.8f) {
				theta = theta - .2f;// a
			}
			move();
			break;
		case 65:
			if (theta <= .8f) {
				theta = theta + .2f;// d
			}
			move();
			break;
		case 69:
			if (y >= -.8f) {
				y = y - .2f;
			}
			move();
			// q
			break;
		case 81:
			if (y <= .8f) {
				y = y + .2f;// e
			}
			move();
			break;
		}

	}

	void startMove() throws Exception {

		if (!isMoving) {
			x = .2f;
			y = 0;
			theta = 0;
			motion.moveInit();
			isMoving = true;
			move();
		}
	}

	void move() throws Exception {

		if (isMoving) {
			moveSettings = naoWalkSettingsPane.getSliderVal();
			System.out.println(moveSettings);
			System.out.println("test");
			txtpnX.setText("X: " + x);
			txtpnY.setText("Y: " + y);
			txtpnZ.setText("Z: " + theta);

			if (x == 0 && y == 0 && theta == 0) {
				x = -.2f;
				motion.moveToward(x, y, theta, moveSettings);
			}

			else

			{
				motion.moveToward(x, y, theta, moveSettings);
			}
		}
	}

	void stop() throws Exception {
		if (isMoving) {

			motion.stopMove();
			motion.waitUntilMoveIsFinished();
			isMoving = false;
			x = 0;
			y = 0;
			theta = 0;
			motion.wakeUp();

		}

	}

	void execute(int keycode) throws Exception {
		if (keycode == 32 && !isMoving) {
			startMove();
		} else if (keycode == 32 && isMoving) {
			stop();
		} else if (isMoving) {
			updateParams(keycode);
		}
	}

	@Override
	public void run() throws Exception {
		motion = new ALMotion(sess);
		isMoving = false;
		naoWalkSettingsPane.run(motion);
		motion.setFallManagerEnabled(true);

	}

	public void enableDisable(boolean enabled) {
		for (Component c : this.getComponents()) {
			c.setEnabled(enabled);
		}
		naoWalkSettingsPane.enableDisable(enabled);
	}

}
