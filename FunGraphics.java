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
		GLabel label = new GLabel("hello, world", 100, 75);
		label.setFont("SansSerif-36");
		label.setColor(Color.RED);
		add(label);

		GRect rect1 = new GRect(10, 10, 50, 50);
		add(rect1);

		GRect rect2 = new GRect(300, 75, 200, 100);
		rect2.setFilled(true);
		rect2.setColor(Color.RED);
		add(rect2);
		
		GOval oval = new GOval(300, 75, 200, 100);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		add(oval);
		
		double centerY = getHeight() / 2;
		GLine myFunkyLine = new GLine(100, centerY, 
									  300, centerY + 50);
		add(myFunkyLine);
		
		GLine dudeWheresMyLine = new GLine(0, 0, 100, 100);
		// Did not add dudeWheresMyLine to the graphics canvas! 
	}
}
