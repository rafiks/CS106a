/*
 * File: SeeingStars.java
 * =============================================================
 * A program that draws pretty stars on the screen!
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SeeingStars extends GraphicsProgram {
	/* Constants controlling the location of the star. */
	private static final double STAR_CENTER_X = 200;
	private static final double STAR_CENTER_Y = 200;
	
	/* Constant controlling the radius of the star. */
	private static final double STAR_RADIUS = 100;
	
	/* Constant controlling how many points the star has. */
	private static final int NUM_STAR_POINTS = 5;
	
	public void run() {
		for (int i = 0; i < NUM_STAR_POINTS; i++) {
			double theta     = i * Math.PI / NUM_STAR_POINTS;
			double nextTheta = (i + 2) * Math.PI / NUM_STAR_POINTS;
			
			GLine line = new GLine(STAR_CENTER_X + STAR_RADIUS * Math.cos(theta),
					               STAR_CENTER_Y + STAR_RADIUS * Math.sin(theta),
					               STAR_CENTER_X + STAR_RADIUS * Math.cos(nextTheta),
								   STAR_CENTER_Y + STAR_RADIUS * Math.sin(nextTheta));
			
		}
	}
	
}
