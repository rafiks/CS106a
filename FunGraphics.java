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
		GRect rect = new GRect(10, 20, 100, 200);
		rect.setFilled(true);
		add(rect);
		
		GOval theOval = new GOval(10, 20, 100, 200);
		theOval.setFilled(true);
		theOval.setColor(Color.RED);
		theOval.setFillColor(Color.GREEN);
		add(theOval);
		
		GLabel bigS = new GLabel("S", 50, 120);
		bigS.setFont("Courier New-BOLD-36");
		bigS.setColor(Color.WHITE);
		add(bigS);
	}
}
