package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class AdvancedRobotRace {
	Robot a;
	Robot b;
	Robot c;
	Robot d;
	Robot e;
	static Random ran=new Random();
	static boolean finished=false;
	 // Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot r[]=new Robot[7];
		for(int i=0; i<7; i++) {
			r[i]=new Robot();
			r[i].setY(500);
		}
		r[0].setX(10);
		r[1].setX(110);
		r[2].setX(210);
		r[3].setX(310);
		r[4].setX(410);
		r[5].setX(510);
		r[6].setX(610);
		
		Thread r1=new Thread (()-> {
			while(!finished) {
			r[0].setSpeed(100);
			r[0].move(ran.nextInt(50));
			if(r[0].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 1, You won!");
			}
			}
		});
		
		Thread r2=new Thread (()-> {
			while(!finished) {
			r[1].setSpeed(100);
			r[1].move(ran.nextInt(50));
			if(r[1].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 2, You won!");
			}
			}
		});
		
		Thread r3=new Thread (()-> {
			while(!finished) {
			r[2].setSpeed(100);
			r[2].move(ran.nextInt(50));
			if(r[2].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 3, You won!");
			}
			}
		});
		
		Thread r4=new Thread (()-> {
			while(!finished) {
			r[3].setSpeed(100);
			r[3].move(ran.nextInt(50));
			if(r[3].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 4, You won!");
			}
			}
		});
		
		Thread r5=new Thread (()-> {
			while(!finished) {
			r[4].setSpeed(100);
			r[4].move(ran.nextInt(50));
			if(r[4].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 5, You won!");
			}
			}
		});
		
		Thread r6=new Thread (()-> {
			while(!finished) {
			r[5].setSpeed(100);
			r[5].move(ran.nextInt(50));
			if(r[5].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 6, You won!");
			}
			}
		});
		
		Thread r7=new Thread (()-> {
			while(!finished) {
			r[6].setSpeed(100);
			r[6].move(ran.nextInt(50));
			if(r[6].getY()<20) {
				finished=true;
				JOptionPane.showMessageDialog(null, " Congratulations Robot 7, You won!");
			}
			}
		});
		
		r1.run();
		r2.run();
		r3.run();
		r4.run();
		r5.run();
		r6.run();
		r7.run();
		}
	}
	

