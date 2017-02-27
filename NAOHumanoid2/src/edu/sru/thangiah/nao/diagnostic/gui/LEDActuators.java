package edu.sru.thangiah.nao.diagnostic.gui;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class LEDActuators {
    private JFrame testFrame;  //frame to test look of Panel
    private JPanel contentPane; //main panel to be accessed by external GUI
    private JScrollPane scrollPane;
    private JPanel sensors; //Scroll Pane that houses all motion sensors
    //stores all JTextFields for Motion Sensors
    private HashMap<String, JTextField> sensorTextFields; //for easy access to any of the JTextFields

    //Note on Naming:  Camel case, name of joint followed by name of sensor, followed by
    //TF for text field or L for label
    //Here lie the hundreds of declarations needed to list out all the sensors in the GUI;
    //Definitely need a JScrollPane for this mess, and some separators to keep things neet
    
    	private JLabel faceRedLeft;
	private JLabel faceRedLeft0L;
	private JTextField faceRedLeft0TF;
	private JLabel faceRedLeft45L;
	private JTextField faceRedLeft45TF;
	private JLabel faceRedLeft90L;
	private JTextField faceRedLeft90TF;
	private JLabel faceRedLeft135L;
	private JTextField faceRedLeft135TF;
	private JLabel faceRedLeft180L;
	private JTextField faceRedLeft180TF;
	private JLabel faceRedLeft225L;
	private JTextField faceRedLeft225TF;
	private JLabel faceRedLeft270L;
	private JTextField faceRedLeft270TF;
	private JLabel faceRedLeft315L;
	private JTextField faceRedLeft315TF;

	private JLabel faceGreenLeft;
	private JLabel faceGreenLeft0L;
	private JTextField faceGreenLeft0TF;
	private JLabel faceGreenLeft45L;
	private JTextField faceGreenLeft45TF;
	private JLabel faceGreenLeft90L;
	private JTextField faceGreenLeft90TF;
	private JLabel faceGreenLeft135L;
	private JTextField faceGreenLeft135TF;
	private JLabel faceGreenLeft180L;
	private JTextField faceGreenLeft180TF;
	private JLabel faceGreenLeft225L;
	private JTextField faceGreenLeft225TF;
	private JLabel faceGreenLeft270L;
	private JTextField faceGreenLeft270TF;
	private JLabel faceGreenLeft315L;
	private JTextField faceGreenLeft315TF;

	private JLabel faceBlueLeft;
	private JLabel faceBlueLeft0L;
	private JTextField faceBlueLeft0TF;
	private JLabel faceBlueLeft45L;
	private JTextField faceBlueLeft45TF;
	private JLabel faceBlueLeft90L;
	private JTextField faceBlueLeft90TF;
	private JLabel faceBlueLeft135L;
	private JTextField faceBlueLeft135TF;
	private JLabel faceBlueLeft180L;
	private JTextField faceBlueLeft180TF;
	private JLabel faceBlueLeft225L;
	private JTextField faceBlueLeft225TF;
	private JLabel faceBlueLeft270L;
	private JTextField faceBlueLeft270TF;
	private JLabel faceBlueLeft315L;
	private JTextField faceBlueLeft315TF;

	private JLabel faceRedRight;
	private JLabel faceRedRight0L;
	private JTextField faceRedRight0TF;
	private JLabel faceRedRight45L;
	private JTextField faceRedRight45TF;
	private JLabel faceRedRight90L;
	private JTextField faceRedRight90TF;
	private JLabel faceRedRight135L;
	private JTextField faceRedRight135TF;
	private JLabel faceRedRight180L;
	private JTextField faceRedRight180TF;
	private JLabel faceRedRight225L;
	private JTextField faceRedRight225TF;
	private JLabel faceRedRight270L;
	private JTextField faceRedRight270TF;
	private JLabel faceRedRight315L;
	private JTextField faceRedRight315TF;

	private JLabel faceGreenRight;
	private JLabel faceGreenRight0L;
	private JTextField faceGreenRight0TF;
	private JLabel faceGreenRight45L;
	private JTextField faceGreenRight45TF;
	private JLabel faceGreenRight90L;
	private JTextField faceGreenRight90TF;
	private JLabel faceGreenRight135L;
	private JTextField faceGreenRight135TF;
	private JLabel faceGreenRight180L;
	private JTextField faceGreenRight180TF;
	private JLabel faceGreenRight225L;
	private JTextField faceGreenRight225TF;
	private JLabel faceGreenRight270L;
	private JTextField faceGreenRight270TF;
	private JLabel faceGreenRight315L;
	private JTextField faceGreenRight315TF;

	private JLabel faceBlueRight;
	private JLabel faceBlueRight0L;
	private JTextField faceBlueRight0TF;
	private JLabel faceBlueRight45L;
	private JTextField faceBlueRight45TF;
	private JLabel faceBlueRight90L;
	private JTextField faceBlueRight90TF;
	private JLabel faceBlueRight135L;
	private JTextField faceBlueRight135TF;
	private JLabel faceBlueRight180L;
	private JTextField faceBlueRight180TF;
	private JLabel faceBlueRight225L;
	private JTextField faceBlueRight225TF;
	private JLabel faceBlueRight270L;
	private JTextField faceBlueRight270TF;
	private JLabel faceBlueRight315L;
	private JTextField faceBlueRight315TF;

	private JLabel rightEarLed;
	private JLabel rightEarLed0L;
	private JTextField rightEarLed0TF;
	private JLabel rightEarLed36L;
	private JTextField rightEarLed36TF;
	private JLabel rightEarLed72L;
	private JTextField rightEarLed72TF;
	private JLabel rightEarLed108L;
	private JTextField rightEarLed108TF;
	private JLabel rightEarLed144L;
	private JTextField rightEarLed144TF;
	private JLabel rightEarLed180L;
	private JTextField rightEarLed180TF;
	private JLabel rightEarLed216L;
	private JTextField rightEarLed216TF;
	private JLabel rightEarLed252L;
	private JTextField rightEarLed252TF;
	private JLabel rightEarLed288L;
	private JTextField rightEarLed288TF;
	private JLabel rightEarLed324L;
	private JTextField rightEarLed324TF;

	private JLabel leftEarLed;
	private JLabel leftEarLed0L;
	private JTextField leftEarLed0TF;
	private JLabel leftEarLed36L;
	private JTextField leftEarLed36TF;
	private JLabel leftEarLed72L;
	private JTextField leftEarLed72TF;
	private JLabel leftEarLed108L;
	private JTextField leftEarLed108TF;
	private JLabel leftEarLed144L;
	private JTextField leftEarLed144TF;
	private JLabel leftEarLed180L;
	private JTextField leftEarLed180TF;
	private JLabel leftEarLed216L;
	private JTextField leftEarLed216TF;
	private JLabel leftEarLed252L;
	private JTextField leftEarLed252TF;
	private JLabel leftEarLed288L;
	private JTextField leftEarLed288TF;
	private JLabel leftEarLed324L;
	private JTextField leftEarLed324TF;

	private JLabel chestBoardLeds;
	private JLabel chestBoardRedL;
	private JTextField chestBoardRedTF;
	private JLabel chestBoardGreenL;
	private JTextField chestBoardGreenTF;
	private JLabel chestBoardBlueL;
	private JTextField chestBoardBlueTF;

	private JLabel leftFootLeds;
	private JLabel leftFootRedL;
	private JTextField leftFootRedTF;
	private JLabel leftFootGreenL;
	private JTextField leftFootGreenTF;
	private JLabel leftFootBlueL;
	private JTextField leftFootBlueTF;

	private JLabel rightFootLeds;
	private JLabel rightFootRedL;
	private JTextField rightFootRedTF;
	private JLabel rightFootGreenL;
	private JTextField rightFootGreenTF;
	private JLabel rightFootBlueL;
	private JTextField rightFootBlueTF;




    public LEDActuators(){
        contentPane = new JPanel();
        sensorTextFields = new HashMap<>();
        sensors = new JPanel();
        sensors.setLayout(new GridLayout(100,1));

        	faceRedLeft = new JLabel("Face Red Left");
	sensors.add(faceRedLeft);
	sensors.add(new JSeparator());
	faceRedLeft0L = new JLabel("Face Red Left 0");
	faceRedLeft0TF = new JTextField();
	sensors.add(faceRedLeft0L);
	sensors.add(faceRedLeft0TF);
	sensorTextFields.put("Face Red Left 0", faceRedLeft0TF);
	faceRedLeft45L = new JLabel("Face Red Left 45");
	faceRedLeft45TF = new JTextField();
	sensors.add(faceRedLeft45L);
	sensors.add(faceRedLeft45TF);
	sensorTextFields.put("Face Red Left 45", faceRedLeft45TF);
	faceRedLeft90L = new JLabel("Face Red Left 90");
	faceRedLeft90TF = new JTextField();
	sensors.add(faceRedLeft90L);
	sensors.add(faceRedLeft90TF);
	sensorTextFields.put("Face Red Left 90", faceRedLeft90TF);
	faceRedLeft135L = new JLabel("Face Red Left 135");
	faceRedLeft135TF = new JTextField();
	sensors.add(faceRedLeft135L);
	sensors.add(faceRedLeft135TF);
	sensorTextFields.put("Face Red Left 135", faceRedLeft135TF);
	faceRedLeft180L = new JLabel("Face Red Left 180");
	faceRedLeft180TF = new JTextField();
	sensors.add(faceRedLeft180L);
	sensors.add(faceRedLeft180TF);
	sensorTextFields.put("Face Red Left 180", faceRedLeft180TF);
	faceRedLeft225L = new JLabel("Face Red Left 225");
	faceRedLeft225TF = new JTextField();
	sensors.add(faceRedLeft225L);
	sensors.add(faceRedLeft225TF);
	sensorTextFields.put("Face Red Left 225", faceRedLeft225TF);
	faceRedLeft270L = new JLabel("Face Red Left 270");
	faceRedLeft270TF = new JTextField();
	sensors.add(faceRedLeft270L);
	sensors.add(faceRedLeft270TF);
	sensorTextFields.put("Face Red Left 270", faceRedLeft270TF);
	faceRedLeft315L = new JLabel("Face Red Left 315");
	faceRedLeft315TF = new JTextField();
	sensors.add(faceRedLeft315L);
	sensors.add(faceRedLeft315TF);
	sensorTextFields.put("Face Red Left 315", faceRedLeft315TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	faceGreenLeft = new JLabel("Face Green Left");
	sensors.add(faceGreenLeft);
	sensors.add(new JSeparator());
	faceGreenLeft0L = new JLabel("Face Green Left 0");
	faceGreenLeft0TF = new JTextField();
	sensors.add(faceGreenLeft0L);
	sensors.add(faceGreenLeft0TF);
	sensorTextFields.put("Face Green Left 0", faceGreenLeft0TF);
	faceGreenLeft45L = new JLabel("Face Green Left 45");
	faceGreenLeft45TF = new JTextField();
	sensors.add(faceGreenLeft45L);
	sensors.add(faceGreenLeft45TF);
	sensorTextFields.put("Face Green Left 45", faceGreenLeft45TF);
	faceGreenLeft90L = new JLabel("Face Green Left 90");
	faceGreenLeft90TF = new JTextField();
	sensors.add(faceGreenLeft90L);
	sensors.add(faceGreenLeft90TF);
	sensorTextFields.put("Face Green Left 90", faceGreenLeft90TF);
	faceGreenLeft135L = new JLabel("Face Green Left 135");
	faceGreenLeft135TF = new JTextField();
	sensors.add(faceGreenLeft135L);
	sensors.add(faceGreenLeft135TF);
	sensorTextFields.put("Face Green Left 135", faceGreenLeft135TF);
	faceGreenLeft180L = new JLabel("Face Green Left 180");
	faceGreenLeft180TF = new JTextField();
	sensors.add(faceGreenLeft180L);
	sensors.add(faceGreenLeft180TF);
	sensorTextFields.put("Face Green Left 180", faceGreenLeft180TF);
	faceGreenLeft225L = new JLabel("Face Green Left 225");
	faceGreenLeft225TF = new JTextField();
	sensors.add(faceGreenLeft225L);
	sensors.add(faceGreenLeft225TF);
	sensorTextFields.put("Face Green Left 225", faceGreenLeft225TF);
	faceGreenLeft270L = new JLabel("Face Green Left 270");
	faceGreenLeft270TF = new JTextField();
	sensors.add(faceGreenLeft270L);
	sensors.add(faceGreenLeft270TF);
	sensorTextFields.put("Face Green Left 270", faceGreenLeft270TF);
	faceGreenLeft315L = new JLabel("Face Green Left 315");
	faceGreenLeft315TF = new JTextField();
	sensors.add(faceGreenLeft315L);
	sensors.add(faceGreenLeft315TF);
	sensorTextFields.put("Face Green Left 315", faceGreenLeft315TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	faceBlueLeft = new JLabel("Face Blue Left");
	sensors.add(faceBlueLeft);
	sensors.add(new JSeparator());
	faceBlueLeft0L = new JLabel("Face Blue Left 0");
	faceBlueLeft0TF = new JTextField();
	sensors.add(faceBlueLeft0L);
	sensors.add(faceBlueLeft0TF);
	sensorTextFields.put("Face Blue Left 0", faceBlueLeft0TF);
	faceBlueLeft45L = new JLabel("Face Blue Left 45");
	faceBlueLeft45TF = new JTextField();
	sensors.add(faceBlueLeft45L);
	sensors.add(faceBlueLeft45TF);
	sensorTextFields.put("Face Blue Left 45", faceBlueLeft45TF);
	faceBlueLeft90L = new JLabel("Face Blue Left 90");
	faceBlueLeft90TF = new JTextField();
	sensors.add(faceBlueLeft90L);
	sensors.add(faceBlueLeft90TF);
	sensorTextFields.put("Face Blue Left 90", faceBlueLeft90TF);
	faceBlueLeft135L = new JLabel("Face Blue Left 135");
	faceBlueLeft135TF = new JTextField();
	sensors.add(faceBlueLeft135L);
	sensors.add(faceBlueLeft135TF);
	sensorTextFields.put("Face Blue Left 135", faceBlueLeft135TF);
	faceBlueLeft180L = new JLabel("Face Blue Left 180");
	faceBlueLeft180TF = new JTextField();
	sensors.add(faceBlueLeft180L);
	sensors.add(faceBlueLeft180TF);
	sensorTextFields.put("Face Blue Left 180", faceBlueLeft180TF);
	faceBlueLeft225L = new JLabel("Face Blue Left 225");
	faceBlueLeft225TF = new JTextField();
	sensors.add(faceBlueLeft225L);
	sensors.add(faceBlueLeft225TF);
	sensorTextFields.put("Face Blue Left 225", faceBlueLeft225TF);
	faceBlueLeft270L = new JLabel("Face Blue Left 270");
	faceBlueLeft270TF = new JTextField();
	sensors.add(faceBlueLeft270L);
	sensors.add(faceBlueLeft270TF);
	sensorTextFields.put("Face Blue Left 270", faceBlueLeft270TF);
	faceBlueLeft315L = new JLabel("Face Blue Left 315");
	faceBlueLeft315TF = new JTextField();
	sensors.add(faceBlueLeft315L);
	sensors.add(faceBlueLeft315TF);
	sensorTextFields.put("Face Blue Left 315", faceBlueLeft315TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	faceRedRight = new JLabel("Face Red Right");
	sensors.add(faceRedRight);
	sensors.add(new JSeparator());
	faceRedRight0L = new JLabel("Face Red Right 0");
	faceRedRight0TF = new JTextField();
	sensors.add(faceRedRight0L);
	sensors.add(faceRedRight0TF);
	sensorTextFields.put("Face Red Right 0", faceRedRight0TF);
	faceRedRight45L = new JLabel("Face Red Right 45");
	faceRedRight45TF = new JTextField();
	sensors.add(faceRedRight45L);
	sensors.add(faceRedRight45TF);
	sensorTextFields.put("Face Red Right 45", faceRedRight45TF);
	faceRedRight90L = new JLabel("Face Red Right 90");
	faceRedRight90TF = new JTextField();
	sensors.add(faceRedRight90L);
	sensors.add(faceRedRight90TF);
	sensorTextFields.put("Face Red Right 90", faceRedRight90TF);
	faceRedRight135L = new JLabel("Face Red Right 135");
	faceRedRight135TF = new JTextField();
	sensors.add(faceRedRight135L);
	sensors.add(faceRedRight135TF);
	sensorTextFields.put("Face Red Right 135", faceRedRight135TF);
	faceRedRight180L = new JLabel("Face Red Right 180");
	faceRedRight180TF = new JTextField();
	sensors.add(faceRedRight180L);
	sensors.add(faceRedRight180TF);
	sensorTextFields.put("Face Red Right 180", faceRedRight180TF);
	faceRedRight225L = new JLabel("Face Red Right 225");
	faceRedRight225TF = new JTextField();
	sensors.add(faceRedRight225L);
	sensors.add(faceRedRight225TF);
	sensorTextFields.put("Face Red Right 225", faceRedRight225TF);
	faceRedRight270L = new JLabel("Face Red Right 270");
	faceRedRight270TF = new JTextField();
	sensors.add(faceRedRight270L);
	sensors.add(faceRedRight270TF);
	sensorTextFields.put("Face Red Right 270", faceRedRight270TF);
	faceRedRight315L = new JLabel("Face Red Right 315");
	faceRedRight315TF = new JTextField();
	sensors.add(faceRedRight315L);
	sensors.add(faceRedRight315TF);
	sensorTextFields.put("Face Red Right 315", faceRedRight315TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	faceGreenRight = new JLabel("Face Green Right");
	sensors.add(faceGreenRight);
	sensors.add(new JSeparator());
	faceGreenRight0L = new JLabel("Face Green Right 0");
	faceGreenRight0TF = new JTextField();
	sensors.add(faceGreenRight0L);
	sensors.add(faceGreenRight0TF);
	sensorTextFields.put("Face Green Right 0", faceGreenRight0TF);
	faceGreenRight45L = new JLabel("Face Green Right 45");
	faceGreenRight45TF = new JTextField();
	sensors.add(faceGreenRight45L);
	sensors.add(faceGreenRight45TF);
	sensorTextFields.put("Face Green Right 45", faceGreenRight45TF);
	faceGreenRight90L = new JLabel("Face Green Right 90");
	faceGreenRight90TF = new JTextField();
	sensors.add(faceGreenRight90L);
	sensors.add(faceGreenRight90TF);
	sensorTextFields.put("Face Green Right 90", faceGreenRight90TF);
	faceGreenRight135L = new JLabel("Face Green Right 135");
	faceGreenRight135TF = new JTextField();
	sensors.add(faceGreenRight135L);
	sensors.add(faceGreenRight135TF);
	sensorTextFields.put("Face Green Right 135", faceGreenRight135TF);
	faceGreenRight180L = new JLabel("Face Green Right 180");
	faceGreenRight180TF = new JTextField();
	sensors.add(faceGreenRight180L);
	sensors.add(faceGreenRight180TF);
	sensorTextFields.put("Face Green Right 180", faceGreenRight180TF);
	faceGreenRight225L = new JLabel("Face Green Right 225");
	faceGreenRight225TF = new JTextField();
	sensors.add(faceGreenRight225L);
	sensors.add(faceGreenRight225TF);
	sensorTextFields.put("Face Green Right 225", faceGreenRight225TF);
	faceGreenRight270L = new JLabel("Face Green Right 270");
	faceGreenRight270TF = new JTextField();
	sensors.add(faceGreenRight270L);
	sensors.add(faceGreenRight270TF);
	sensorTextFields.put("Face Green Right 270", faceGreenRight270TF);
	faceGreenRight315L = new JLabel("Face Green Right 315");
	faceGreenRight315TF = new JTextField();
	sensors.add(faceGreenRight315L);
	sensors.add(faceGreenRight315TF);
	sensorTextFields.put("Face Green Right 315", faceGreenRight315TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	faceBlueRight = new JLabel("Face Blue Right");
	sensors.add(faceBlueRight);
	sensors.add(new JSeparator());
	faceBlueRight0L = new JLabel("Face Blue Right 0");
	faceBlueRight0TF = new JTextField();
	sensors.add(faceBlueRight0L);
	sensors.add(faceBlueRight0TF);
	sensorTextFields.put("Face Blue Right 0", faceBlueRight0TF);
	faceBlueRight45L = new JLabel("Face Blue Right 45");
	faceBlueRight45TF = new JTextField();
	sensors.add(faceBlueRight45L);
	sensors.add(faceBlueRight45TF);
	sensorTextFields.put("Face Blue Right 45", faceBlueRight45TF);
	faceBlueRight90L = new JLabel("Face Blue Right 90");
	faceBlueRight90TF = new JTextField();
	sensors.add(faceBlueRight90L);
	sensors.add(faceBlueRight90TF);
	sensorTextFields.put("Face Blue Right 90", faceBlueRight90TF);
	faceBlueRight135L = new JLabel("Face Blue Right 135");
	faceBlueRight135TF = new JTextField();
	sensors.add(faceBlueRight135L);
	sensors.add(faceBlueRight135TF);
	sensorTextFields.put("Face Blue Right 135", faceBlueRight135TF);
	faceBlueRight180L = new JLabel("Face Blue Right 180");
	faceBlueRight180TF = new JTextField();
	sensors.add(faceBlueRight180L);
	sensors.add(faceBlueRight180TF);
	sensorTextFields.put("Face Blue Right 180", faceBlueRight180TF);
	faceBlueRight225L = new JLabel("Face Blue Right 225");
	faceBlueRight225TF = new JTextField();
	sensors.add(faceBlueRight225L);
	sensors.add(faceBlueRight225TF);
	sensorTextFields.put("Face Blue Right 225", faceBlueRight225TF);
	faceBlueRight270L = new JLabel("Face Blue Right 270");
	faceBlueRight270TF = new JTextField();
	sensors.add(faceBlueRight270L);
	sensors.add(faceBlueRight270TF);
	sensorTextFields.put("Face Blue Right 270", faceBlueRight270TF);
	faceBlueRight315L = new JLabel("Face Blue Right 315");
	faceBlueRight315TF = new JTextField();
	sensors.add(faceBlueRight315L);
	sensors.add(faceBlueRight315TF);
	sensorTextFields.put("Face Blue Right 315", faceBlueRight315TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	rightEarLed = new JLabel("Right Ear Led");
	sensors.add(rightEarLed);
	sensors.add(new JSeparator());
	rightEarLed0L = new JLabel("Right Ear Led 0");
	rightEarLed0TF = new JTextField();
	sensors.add(rightEarLed0L);
	sensors.add(rightEarLed0TF);
	sensorTextFields.put("Right Ear Led 0", rightEarLed0TF);
	rightEarLed36L = new JLabel("Right Ear Led 36");
	rightEarLed36TF = new JTextField();
	sensors.add(rightEarLed36L);
	sensors.add(rightEarLed36TF);
	sensorTextFields.put("Right Ear Led 36", rightEarLed36TF);
	rightEarLed72L = new JLabel("Right Ear Led 72");
	rightEarLed72TF = new JTextField();
	sensors.add(rightEarLed72L);
	sensors.add(rightEarLed72TF);
	sensorTextFields.put("Right Ear Led 72", rightEarLed72TF);
	rightEarLed108L = new JLabel("Right Ear Led 108");
	rightEarLed108TF = new JTextField();
	sensors.add(rightEarLed108L);
	sensors.add(rightEarLed108TF);
	sensorTextFields.put("Right Ear Led 108", rightEarLed108TF);
	rightEarLed144L = new JLabel("Right Ear Led 144");
	rightEarLed144TF = new JTextField();
	sensors.add(rightEarLed144L);
	sensors.add(rightEarLed144TF);
	sensorTextFields.put("Right Ear Led 144", rightEarLed144TF);
	rightEarLed180L = new JLabel("Right Ear Led 180");
	rightEarLed180TF = new JTextField();
	sensors.add(rightEarLed180L);
	sensors.add(rightEarLed180TF);
	sensorTextFields.put("Right Ear Led 180", rightEarLed180TF);
	rightEarLed216L = new JLabel("Right Ear Led 216");
	rightEarLed216TF = new JTextField();
	sensors.add(rightEarLed216L);
	sensors.add(rightEarLed216TF);
	sensorTextFields.put("Right Ear Led 216", rightEarLed216TF);
	rightEarLed252L = new JLabel("Right Ear Led 252");
	rightEarLed252TF = new JTextField();
	sensors.add(rightEarLed252L);
	sensors.add(rightEarLed252TF);
	sensorTextFields.put("Right Ear Led 252", rightEarLed252TF);
	rightEarLed288L = new JLabel("Right Ear Led 288");
	rightEarLed288TF = new JTextField();
	sensors.add(rightEarLed288L);
	sensors.add(rightEarLed288TF);
	sensorTextFields.put("Right Ear Led 288", rightEarLed288TF);
	rightEarLed324L = new JLabel("Right Ear Led 324");
	rightEarLed324TF = new JTextField();
	sensors.add(rightEarLed324L);
	sensors.add(rightEarLed324TF);
	sensorTextFields.put("Right Ear Led 324", rightEarLed324TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	leftEarLed = new JLabel("Left Ear Led");
	sensors.add(leftEarLed);
	sensors.add(new JSeparator());
	leftEarLed0L = new JLabel("Left Ear Led 0");
	leftEarLed0TF = new JTextField();
	sensors.add(leftEarLed0L);
	sensors.add(leftEarLed0TF);
	sensorTextFields.put("Left Ear Led 0", leftEarLed0TF);
	leftEarLed36L = new JLabel("Left Ear Led 36");
	leftEarLed36TF = new JTextField();
	sensors.add(leftEarLed36L);
	sensors.add(leftEarLed36TF);
	sensorTextFields.put("Left Ear Led 36", leftEarLed36TF);
	leftEarLed72L = new JLabel("Left Ear Led 72");
	leftEarLed72TF = new JTextField();
	sensors.add(leftEarLed72L);
	sensors.add(leftEarLed72TF);
	sensorTextFields.put("Left Ear Led 72", leftEarLed72TF);
	leftEarLed108L = new JLabel("Left Ear Led 108");
	leftEarLed108TF = new JTextField();
	sensors.add(leftEarLed108L);
	sensors.add(leftEarLed108TF);
	sensorTextFields.put("Left Ear Led 108", leftEarLed108TF);
	leftEarLed144L = new JLabel("Left Ear Led 144");
	leftEarLed144TF = new JTextField();
	sensors.add(leftEarLed144L);
	sensors.add(leftEarLed144TF);
	sensorTextFields.put("Left Ear Led 144", leftEarLed144TF);
	leftEarLed180L = new JLabel("Left Ear Led 180");
	leftEarLed180TF = new JTextField();
	sensors.add(leftEarLed180L);
	sensors.add(leftEarLed180TF);
	sensorTextFields.put("Left Ear Led 180", leftEarLed180TF);
	leftEarLed216L = new JLabel("Left Ear Led 216");
	leftEarLed216TF = new JTextField();
	sensors.add(leftEarLed216L);
	sensors.add(leftEarLed216TF);
	sensorTextFields.put("Left Ear Led 216", leftEarLed216TF);
	leftEarLed252L = new JLabel("Left Ear Led 252");
	leftEarLed252TF = new JTextField();
	sensors.add(leftEarLed252L);
	sensors.add(leftEarLed252TF);
	sensorTextFields.put("Left Ear Led 252", leftEarLed252TF);
	leftEarLed288L = new JLabel("Left Ear Led 288");
	leftEarLed288TF = new JTextField();
	sensors.add(leftEarLed288L);
	sensors.add(leftEarLed288TF);
	sensorTextFields.put("Left Ear Led 288", leftEarLed288TF);
	leftEarLed324L = new JLabel("Left Ear Led 324");
	leftEarLed324TF = new JTextField();
	sensors.add(leftEarLed324L);
	sensors.add(leftEarLed324TF);
	sensorTextFields.put("Left Ear Led 324", leftEarLed324TF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	chestBoardLeds = new JLabel("Chest Board Leds");
	sensors.add(chestBoardLeds);
	sensors.add(new JSeparator());
	chestBoardRedL = new JLabel("Chest Board Red");
	chestBoardRedTF = new JTextField();
	sensors.add(chestBoardRedL);
	sensors.add(chestBoardRedTF);
	sensorTextFields.put("Chest Board Red", chestBoardRedTF);
	chestBoardGreenL = new JLabel("Chest Board Green");
	chestBoardGreenTF = new JTextField();
	sensors.add(chestBoardGreenL);
	sensors.add(chestBoardGreenTF);
	sensorTextFields.put("Chest Board Green", chestBoardGreenTF);
	chestBoardBlueL = new JLabel("Chest Board Blue");
	chestBoardBlueTF = new JTextField();
	sensors.add(chestBoardBlueL);
	sensors.add(chestBoardBlueTF);
	sensorTextFields.put("Chest Board Blue", chestBoardBlueTF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	leftFootLeds = new JLabel("Left Foot Leds");
	sensors.add(leftFootLeds);
	sensors.add(new JSeparator());
	leftFootRedL = new JLabel("Left Foot Red");
	leftFootRedTF = new JTextField();
	sensors.add(leftFootRedL);
	sensors.add(leftFootRedTF);
	sensorTextFields.put("Left Foot Red", leftFootRedTF);
	leftFootGreenL = new JLabel("Left Foot Green");
	leftFootGreenTF = new JTextField();
	sensors.add(leftFootGreenL);
	sensors.add(leftFootGreenTF);
	sensorTextFields.put("Left Foot Green", leftFootGreenTF);
	leftFootBlueL = new JLabel("Left Foot Blue");
	leftFootBlueTF = new JTextField();
	sensors.add(leftFootBlueL);
	sensors.add(leftFootBlueTF);
	sensorTextFields.put("Left Foot Blue", leftFootBlueTF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());

	rightFootLeds = new JLabel("Right Foot Leds");
	sensors.add(rightFootLeds);
	sensors.add(new JSeparator());
	rightFootRedL = new JLabel("Right Foot Red");
	rightFootRedTF = new JTextField();
	sensors.add(rightFootRedL);
	sensors.add(rightFootRedTF);
	sensorTextFields.put("Right Foot Red", rightFootRedTF);
	rightFootGreenL = new JLabel("Right Foot Green");
	rightFootGreenTF = new JTextField();
	sensors.add(rightFootGreenL);
	sensors.add(rightFootGreenTF);
	sensorTextFields.put("Right Foot Green", rightFootGreenTF);
	rightFootBlueL = new JLabel("Right Foot Blue");
	rightFootBlueTF = new JTextField();
	sensors.add(rightFootBlueL);
	sensors.add(rightFootBlueTF);
	sensorTextFields.put("Right Foot Blue", rightFootBlueTF);
	sensors.add(new JSeparator());
	sensors.add(new JSeparator());



        for(Map.Entry<String,JTextField> entry : sensorTextFields.entrySet()){
            entry.getValue().setEditable(false);
        }
        //contentPane.setLayout(new FlowLayout());
        //testFrame = new JFrame("Test Motion Sensors");
        //testFrame.setContentPane(contentPane);
        //testFrame.setSize(500,500);
        scrollPane = new JScrollPane(sensors);
        scrollPane.setPreferredSize(new Dimension(400,500));
        //contentPane.add(scrollPane);
        //testFrame.setVisible(true);
    }

    //Method to set any Sensor Value based on its name
    public boolean setSensorValue(String sensorLEDActuators, String value){
        if(sensorTextFields.containsKey(sensorLEDActuators)) {
            sensorTextFields.get(sensorLEDActuators).setEditable(true);
            sensorTextFields.get(sensorLEDActuators).setText(value);
            sensorTextFields.get(sensorLEDActuators).setEditable(false);
            return true;
        }
        else return false;
    }


    //what should actually be passed to the main GUI
    public JScrollPane getScrollPane(){ return scrollPane;}

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LEDActuators();
            }
        });
    }
}