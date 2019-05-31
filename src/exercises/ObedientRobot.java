package exercises;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot ObiRobot = new Robot("minion");

	public void Settings() {
		ObiRobot.penDown();
		ObiRobot.setSpeed(20);
		ObiRobot.setPos(300, 250);
		ObiRobot.setPenWidth(3);
		ObiRobot.setPenColor(Color.ORANGE);
	}

	public void drawTriangle() {
		Settings();
		for (int i = 0; i < 3; i++) {

			ObiRobot.move(150);
			ObiRobot.turn(120);
		}

	}

	public void drawSquare() {
		Settings();
		for (int i = 0; i < 4; i++) {

			ObiRobot.move(150);
			ObiRobot.turn(90);
		}

	}

	public void drawCircle() {
		Settings();
		for (int i = 0; i < 360; i++) {

			ObiRobot.turn(1);
			ObiRobot.move(1);
		}
	}

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to shape-draw");
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);

		if (shape == 1) {
			new ObedientRobot().drawSquare();
		} else if (shape == 2) {
			new ObedientRobot().drawTriangle();
		} else if (shape == 0) {
			new ObedientRobot().drawCircle();
		}

	}
}
