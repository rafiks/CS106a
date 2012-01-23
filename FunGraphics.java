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
		double ovalX = 100;
		
		GRect rect = new GRect(ovalX, 20, 100, 200);
		rect.setFilled(true);
		add(rect);
		
		/* Create our artistic rendition of the Stanford Oval. */
		GOval theOval = new GOval(ovalX, 20, 100, 200);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
	}
}
