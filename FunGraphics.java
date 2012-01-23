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
		double xCoord = (getWidth() - 100) / 2.0;
		
		/* Create the foreground oval. */
		GOval theOval = new GOval(xCoord, 20, 100, 200);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
	}
}
