package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
 Robot Matt=new Robot(700, 700);
 Robot Joe=new Robot(700, 700);
 Robot Sandy=new Robot(700, 700);
 Robot Bob=new Robot(700, 700);
 Robot Bill=new Robot(700, 700);

public static void main(String[] args) {
	OlympicRings_Threaded or=new OlympicRings_Threaded();
	or.Robots();
}
void Robots() {
	Thread r1=new Thread(()-> {
	Matt.setSpeed(5);
    Matt.moveTo(200, 250);
	Matt.penDown();
	for(int i=0; i<360; i++) {
		Matt.turn(1);
		Matt.move(2);
	}
	});
	
	Thread r2=new Thread(()-> {
		Joe.setSpeed(5);
		Joe.moveTo(400, 250);
		Joe.penDown();
		for(int i=0; i<360; i++) {
			Joe.turn(1);
			Joe.move(2);
		}
		});
	
	Thread r3=new Thread(()-> {
		Sandy.setSpeed(5);
		Sandy.moveTo(600, 250);
		Sandy.penDown();
		for(int i=0; i<360; i++) {
			Sandy.turn(1);
			Sandy.move(2);
		}
		});
	
	Thread r4=new Thread(()-> {
		Bob.setSpeed(5);
		Bob.moveTo(300, 350);
		Bob.penDown();
		for(int i=0; i<360; i++) {
			Bob.turn(1);
			Bob.move(2);
		}
		});
	
	Thread r5=new Thread(()-> {
		Bill.setSpeed(5);
		Bill.moveTo(500, 350);
		Bill.penDown();
		for(int i=0; i<360; i++) {
			Bill.turn(1);
			Bill.move(2);
		}
		});
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
	
}

}

