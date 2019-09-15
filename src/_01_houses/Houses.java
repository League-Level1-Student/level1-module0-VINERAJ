package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.moveTo(850, 500);
	drawHouse(200);
}
public static void drawHouse(int height) {
	
	rob.setSpeed(10);
	rob.penDown();
	rob.turn(-90);
	for(int i=0;i<10;i++){
	rob.move(20);
	rob.turn(90);
	rob.move(height);
	rob.turn(-90);
	rob.move(40);
	rob.turn(-90);
	rob.move(height);
	rob.turn(90);
	rob.move(20);
	}
	rob.hide();
}
}
