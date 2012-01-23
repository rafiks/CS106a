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
	private static final double OVAL_X = 10;
	private static final double OVAL_Y = 20;
	private static final double OVAL_WIDTH = 100;
	private static final double OVAL_HEIGHT = 200;
	
	public void run() {
		/* Create the background. */
		GRect rect = new GRect(10, 20, 100, 200);
		rect.setFilled(true);
		rect.setColor(Color.DARK_GRAY);
		add(rect);
		
		/* Create the foreground oval. */
		GOval theOval = new GOval(10, 20, 100, 200);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
	}
}
