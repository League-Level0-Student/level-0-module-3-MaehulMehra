
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (int all = 0; all < 5; all ++) {
		String color = JOptionPane.showInputDialog(null, " What color do you want the robot to draw with, red, green, or blue?");
		//1. Create a new Robot
		Robot rob = new Robot ();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		rob.penDown();
		rob.setSpeed(100);
		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(255,0,0);
		}
		else if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		}
		else if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else {
			rob.setRandomPenColor();
		}
		rob.setPenWidth(10);
		for (int i = 0; i <4; i ++) {
			rob.move(100);
			rob.turn(90);
		}
		}
		//3. Set the pen width to 10
	
		//4. Ask the user what color pen they would like the robot to draw with	
		
		//5. Use an if/else statement to set the pen color that the user requested
		
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
