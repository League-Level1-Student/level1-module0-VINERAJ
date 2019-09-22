package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.moveTo(850, 500);
	drawHouse("small","blue");
	drawHouse("medium","red");
	drawHouse("large","green");
	drawHouse("medium","blue");
	drawHouse("small","green");
	drawHouse("large","red");
	drawHouse("large","blue");
	drawHouse("small","blue");
	drawHouse("medium","red");
}
public static void drawPointyRoof() {
	rob.turn(-45);
	rob.move(20);
	rob.turn(-90);
	rob.move(20);
	rob.turn(-45);
}
public static void drawFlatRoof() {
	rob.turn(-90);
	rob.move(40);
	rob.turn(-90);
}
public static void drawHouse(String hight,String colour) {
	
	int height = 0;
	if(colour.equalsIgnoreCase("blue"))
		rob.setPenColor(0, 0, 255);
	else if(colour.equalsIgnoreCase("red"))
		rob.setPenColor(255, 0, 0);
	else if(colour.equalsIgnoreCase("green"))
		rob.setPenColor(0, 255, 0);
	if(hight.equalsIgnoreCase("small"))
		height+=60;
	else if(hight.equalsIgnoreCase("medium"))
		height+=120;
	else if(hight.equalsIgnoreCase("large"))
		height+=250;
	rob.setSpeed(100);
	rob.penDown();
	rob.turn(-90);
	//for(tint i=0;i<10;i++){
	rob.move(20);
	rob.turn(90);
	rob.move(height);
	if(hight.equalsIgnoreCase("large"))
		drawFlatRoof();
	else {
		drawPointyRoof();
	}
	rob.move(height);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
}
}
