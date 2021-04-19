package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
static Robot Matt=new Robot(700, 700);
static Robot Joe=new Robot(700, 700);
static Robot Sandy=new Robot(700, 700);
static Robot Bob=new Robot(700, 700);
static Robot Bill=new Robot(700, 700);

public static void main(String[] args) {
	Matt.setSpeed(10);
	Joe.setSpeed(10);
	Sandy.setSpeed(10);
	Bob.setSpeed(10);
	Bill.setSpeed(10);
	
	Matt.moveTo(200, 250);
	Joe.moveTo(400, 250);
	Sandy.moveTo(600, 250);
	Bob.moveTo(300, 350);
	Bill.moveTo(500, 350);
}
}

