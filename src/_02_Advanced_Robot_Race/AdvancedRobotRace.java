package _02_Advanced_Robot_Race;

import org.jointheleague.graphical.robot.Robot;
public class AdvancedRobotRace {
	Robot a;
	Robot b;
	Robot c;
	Robot d;
	Robot e;
	 // Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static Robot[] robots= new Robot[5];
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			robots[i]=new Robot();
		}
		AdvancedRobotRace arr=new AdvancedRobotRace();
		arr.race();
	}
	void race() {
		Thread r1=new Thread(()-> {
			
		});
		
		}
	}

