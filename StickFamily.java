/*
 * File: StickFamily.java
 * =======================================================
 * A program that draws a family of stick figures!
 */
import acm.graphics.*;
import acm.program.*;

public class StickFamily extends GraphicsProgram {
	private static final double HEAD_PROPORTION = 1.0 / 3.0;
	private static final double LEG_PROPORTION  = 1.0 / 3.0;
	private static final double ARM_PROPORTION  = 1.0 / 2.0;
	private static final double LEG_PROPORTION  = 1.0 / 3.0;
	
	private void drawStickPerson(double x, double y, double height) {
		drawStickHead(x, y, height);
		drawStickBody(x, y, height);
		drawStickLegs(x, y, height);
	}
	
	private double headSize(double personSize) {
		return HEAD_PROPORTION * personSize;
	}
	
	private void drawStickHead(double x, double y, double personHeight) {
		double size = headSize(personSize);
		add(new GOval(x - size / 2, y, size, size));
	}
}
