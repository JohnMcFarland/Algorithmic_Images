package olympicRings;

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;

public class OlympicRings1 extends Applet {

	public void paint(Graphics g) {
		setBackground(Color.WHITE);	
		for (int i = 0; i < 3; i++) {
			drawCircle(
				g,
				UPPER_LEFT_X + i * (CIRCLE_DIAMETER),
				UPPER_LEFT_Y, 
				CIRCLE_DIAMETER,
				circleColors[i]);
		}
		for (int i = 0; i < 2; i++) {
			drawCircle(
				g,
				UPPER_LEFT_X + (CIRCLE_DIAMETER / 2) + i * (CIRCLE_DIAMETER), 
				UPPER_LEFT_Y + (CIRCLE_DIAMETER / 2), 
				CIRCLE_DIAMETER,
				circleColors[i+3]);
		}
	}

	private void drawCircle(Graphics g, int x, int y, int diam, Color color) {
		g.setColor(color);
		g.fillOval(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
	}
	
	Color [] circleColors = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};

	private static final int
		UPPER_LEFT_X = 10,
		UPPER_LEFT_Y = 10,
		CIRCLE_DIAMETER = 100;
}