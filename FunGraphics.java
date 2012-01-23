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
	public void run() {
		/* Create a background rectangle. */
		GRect rect = new GRect(50, 20, 100, 200);
		rect.setFilled(true);
		rect.setColor(Color.ORANGE);
		add(rect);
		
		/* Create the foreground oval. */
		GOval theOval = new GOval(50, 20, 100, 200);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
	}
}
