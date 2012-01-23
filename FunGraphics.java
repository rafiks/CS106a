/*
 * File: FunGraphics.java
 * -----------------------
 * This program shows some examples of having
 * fun with a GraphicsProgram.
 */


/* Packages being imported */
import acm.graphics.*;	// Needed for GraphicsProgram
import acm.program.*;	// Needed for all Programs
import java.awt.*;		// Needed for Colors


public class FunGraphics extends GraphicsProgram {
	private static final double OVAL_X = 300;
	private static final double OVAL_Y = 20;
	private static final double OVAL_WIDTH = 100;
	private static final double OVAL_HEIGTH = 200;
	
	public void run() {	
		GRect rect = new GRect(OVAL_X, OVAL_Y, 100, 200);
		rect.setFilled(true);
		add(rect);
		
		/* Create our artistic rendition of the Stanford Oval. */
		GOval theOval = new GOval(OVAL_X, OVAL_Y, 100, 200);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
	}
}
