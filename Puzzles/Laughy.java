package Puzzles;
import java.applet.*;
import java.awt.*;

public class Laughy extends Applet {


	public void paint(Graphics g) {	
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				drawSmiley(
						g, 
						UPPER_LEFT_X + ( i * UPPER_DIAMETER), 
						UPPER_LEFT_Y + (j * UPPER_DIAMETER),
						UPPER_DIAMETER);
				System.out.println("i is: " + i + "j is: " + j);
			}
		}
	
	}
	
	private void drawSmiley(Graphics g, int x, int y, int diameter){
		//draw the circle with border
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, diameter, diameter);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, diameter, diameter);
		//eyes
		g.fillOval(x+5, y+15, diameter/5, diameter/4);
		g.fillOval(x+(diameter-15), y+15, diameter/5, diameter/4);
		//mouth
		g.fillArc(x+10, y+(diameter-20), (diameter/2)+5, 5, 200, 150);
	}
	
	
	
	
	private static final int
	UPPER_LEFT_X = 10,
	UPPER_LEFT_Y = 10,
	UPPER_DIAMETER = 50;
	
	
}



