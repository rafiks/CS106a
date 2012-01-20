/*
 * File: FunGraphics.java
 * -----------------------
 * This program shows some examples of having
 * fun with a GraphicsProgram.
 */


/* packages being imported */
import acm.graphics.*;	// Needed for GraphicsProgram
import acm.program.*;	// Needed for all Programs
import java.awt.*;		// Needed for Colors


public class FunGraphics extends GraphicsProgram {

	public void run() {
		GRect rect = new GRect(10, 20, 100, 200);
		rect.setFilled(true);
		rect.setColor(Color.CYAN);
		add(rect);
	}
}
