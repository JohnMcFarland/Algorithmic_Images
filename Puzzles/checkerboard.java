package Puzzles;
import java.applet.*;
import java.awt.*;

public class checkerboard extends Applet {


	public void paint(Graphics g) {	
		setBackground(Color.ORANGE);
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 4; i++) {
				if(j % 2 == 0){
					//Odd lines
					drawBoard(
							g, 
							UPPER_LEFT_X + ( (2*i) * UPPER_DIAMETER), 
							UPPER_LEFT_Y + (j * UPPER_DIAMETER),
							UPPER_DIAMETER);
					
					drawPiece(
							g, 
							(UPPER_LEFT_X + UPPER_DIAMETER) + ((2*i) * UPPER_DIAMETER), 
							UPPER_LEFT_Y + (j * UPPER_DIAMETER),
							UPPER_DIAMETER,
							j);
					
				}else{
					//Even lines
					drawBoard(
							g, 
							(UPPER_LEFT_X + UPPER_DIAMETER) + ((2*i) * UPPER_DIAMETER), 
							UPPER_LEFT_Y + (j * UPPER_DIAMETER),
							UPPER_DIAMETER);
						
					drawPiece(
							g, 
							UPPER_LEFT_X + ( (2*i) * UPPER_DIAMETER), 
							UPPER_LEFT_Y + (j * UPPER_DIAMETER),
							UPPER_DIAMETER,
							j);
					
				}
				
				System.out.println("i is: " + i + "    j is: " + j);	
			}
			
		}
	
	}
	
	private void drawBoard(Graphics g, int x, int y, int diameter){
		g.setColor(Color.WHITE);
		g.fillRect(x,y,diameter,diameter);
	}
	
	private void drawPiece(Graphics g, int x, int y, int diameter, int j){
		if(j < 3){
			g.setColor(Color.RED);
			g.fillOval(x,y,diameter,diameter);
		
		}else if(j > 4){
			g.setColor(Color.BLACK);
			g.fillOval(x,y,diameter,diameter);
			
		}
	}
	
	private static final int
	UPPER_LEFT_X = 10,
	UPPER_LEFT_Y = 10,
	UPPER_DIAMETER = 30;
	
	
}



