package Puzzles;
import java.applet.*;
import java.awt.*;

public class geometricSequence1 extends Applet {


	public void paint(Graphics g) {	
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10-j; i++) {
				
				drawBox(
						g, 
						(BOTTOM_LEFT_X + midpoint) + (i * BOTTOM_DIAMETER) +(i * SPACER), 
						BOTTOM_LEFT_Y - (j * BOTTOM_DIAMETER) - (j*SPACER),
						BOTTOM_DIAMETER);
				
				drawCircle(
						g, 
						(BOTTOM_LEFT_X + midpoint) + (i * BOTTOM_DIAMETER) +(i * SPACER), 
						BOTTOM_LEFT_Y - (j * BOTTOM_DIAMETER) - (j*SPACER),
						BOTTOM_DIAMETER);
				
				System.out.println("i is: " + i + "    j is: " + j);	
			}
			midpoint += (BOTTOM_DIAMETER/2) + (SPACER/2);
		}
	
	}
	
	private void drawBox(Graphics g, int x, int y, int diameter){
		g.setColor(Color.BLUE);
		g.drawRect(x,y,diameter,diameter);
	}
	
	private void drawCircle(Graphics g, int x, int y, int diameter){
		g.setColor(Color.RED);
		g.drawOval(x,y,diameter,diameter);
		
	}
	private int midpoint = 0;
	//private boolean first = true;
	
	private static final int
	BOTTOM_LEFT_X = 10,
	BOTTOM_LEFT_Y = 500,
	BOTTOM_DIAMETER = 20,
	SPACER = 10;
	
}



