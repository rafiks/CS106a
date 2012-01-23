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
	private static final int OVAL_X = 10;
	private static final int OVAL_Y = 20;
	private static final int OVAL_WIDTH = 100;
	private static final int OVAL_HEIGHT = 200;
	
	public void run() {
		/* Create the background. */
		GRect rect = new GRect(OVAL_X, OVAL_Y, OVAL_WIDTH, OVAL_HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.DARK_GRAY);
		add(rect);
		
		/* Create the foreground oval. */
		GOval theOval = new GOval(OVAL_X, OVAL_Y, OVAL_WIDTH, OVAL_HEIGHT);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
	}
}
