package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot Joe=new Robot();
		
	
				Joe.penDown();


		Joe.setSpeed(10);

		// 4. Do the following (steps 6-9) 75 times
		for (int i = 0; i < 75; i++) {
			Joe.move(5*i);
            Joe.setRandomPenColor();Joe.

	
	
			
		Joe.turn(120);
		
		
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
		}

	}
}
