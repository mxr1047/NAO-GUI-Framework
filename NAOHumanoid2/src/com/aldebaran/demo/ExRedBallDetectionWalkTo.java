package com.aldebaran.demo;

import java.util.List;

import com.aldebaran.qimessaging.Application;
import com.aldebaran.qimessaging.CallError;
import com.aldebaran.qimessaging.Future;
import com.aldebaran.qimessaging.Session;
import com.aldebaran.qimessaging.helpers.al.ALCloseObjectDetection;
import com.aldebaran.qimessaging.helpers.al.ALMemory;
import com.aldebaran.qimessaging.helpers.al.ALMotion;
import com.aldebaran.qimessaging.helpers.al.ALRedBallDetection;
import com.aldebaran.qimessaging.helpers.al.ALRedBallTracker;
import com.aldebaran.qimessaging.helpers.al.ALRobotPosture;
import com.aldebaran.qimessaging.helpers.al.ALTextToSpeech;
import com.aldebaran.qimessaging.helpers.al.ALTracker;


public class ExRedBallDetectionWalkTo {
	
	public static Session session;
	public static Application app;
	public static  Future<Void> future;
	public static ALTextToSpeech tts;
	public static ALRedBallDetection redBallDetect;
	public static ALMemory alMemory;
	public static ALTracker alTracker;
	public static ALRobotPosture alPosture;
	public static ALMotion	alMotion;
	public static boolean isRedBallDetected =false;
	public static boolean isBumperPessed = false;
	public static List<Float> redBallPosition;

	public static void main(String[] args) throws CallError, InterruptedException {
		// TODO Auto-generated method stub
		session = new Session();
		app = new Application();
        future = null;
        
        //ALRedBallDetection redBallDet;
        
        try {
	        future = session.connect("tcp://"+RobotIP.ip+":"+RobotIP.port);

            synchronized (future) {
                future.wait(1000);
            }
            
            if(!session.isConnected()) {
            	System.out.println("FAILED to connect to robot at IP: "+RobotIP.ip+" Port: "+RobotIP.port);
            	System.exit(1);
            }
	        
	        tts = new ALTextToSpeech(session);
	        alMemory = new ALMemory(session);
	        alTracker = new ALTracker(session);
	        alPosture = new ALRobotPosture(session);
	        alMotion = new ALMotion(session);
	        
	        // Wake up robot
	        alMotion.wakeUp();
	        
	        //Go to posture stand
	        alPosture.goToPosture("StandInit", 0.8f);
	       
	        
	        alMemory.subscribeToEvent("redBallDetected", "onBallDetected::(m)", new Object() {
	        	 public void onBallDetected(Object param) throws InterruptedException, CallError 
		            {
	        		 		if(!isRedBallDetected)
	        		 		{
	        		 			isRedBallDetected=true;
	        		 			//tts.say("I spy with my little eye a red ball");
	        		 			System.out.println("I spy with my little eye a red ball at "+alTracker.getTargetPosition(1));
	        		 		}
	        		 		
	        		 		//redBallPosition = alTracker.getTargetPosition();
	        		 		//if( redBallPosition.at() > 
	        		 		
	        		 		/*
	        		 		if(isRedBallDetected) {
								isRedBallDetected=false;
								tts.say("red ball went bye bye");
								System.out.println("red ball went bye bye");
							}
							*/

		            }
	        });
	                
	        
	        alMemory.subscribeToEvent("LeftBumperPressed" , "onEnd::(f)", new Object() {
	            public void onEnd(Float touch) throws InterruptedException, CallError {
	            	if(!isBumperPessed) {
	            		isBumperPessed=true;
		            	alTracker.stopTracker();
		            	alTracker.unregisterAllTargets();
			            tts.say("Application is stopping");
			            app.stop();
			            isBumperPessed=false;
	            	}
	            }
            });
	        
	        
	        /*
	        alMemory.subscribeToEvent("redBallDetected", "onBallDetected::(p1,p2,p3)", new Object() 
            {
	            public void onBallDetected(java.lang.String param1, java.lang.Object param2, java.lang.String param3) throws InterruptedException, CallError 
	            {
	            	System.out.println("Red ball detected!");
	        		System.out.println("param1: "+param1);
	        		System.out.println("param2: "+(ALRedBallDetection)param2);
	        		System.out.println("param3: "+param3);
	        		try {
						System.out.println("I spy with my little eye a red ball at "+redBallTrack.getPosition());
					} catch (CallError e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
            });
            */
	        
	        alTracker.addTarget("RedBall", 0.10f);
	        alTracker.setMode("Head");
	        alTracker.track("RedBall");
	        
	       
	        
            app.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}