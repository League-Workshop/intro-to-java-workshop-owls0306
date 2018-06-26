package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		Robot djkitten = new Robot();
		
		djkitten.miniaturize();
		djkitten.setPenColor(Color.MAGENTA);  
		djkitten.setPenWidth(10);
		djkitten.setSpeed(500);
		djkitten.penDown();
		
		
		djkitten.move(200);
		djkitten.turn(90);
		djkitten.move(200);
		djkitten.turn(90);
		djkitten.move(200);
		djkitten.turn(90);
		djkitten.move(200);
		djkitten.turn(90);
	}
}