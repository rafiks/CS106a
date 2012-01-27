/*
 * File: SaturnVLaunch.java
 * ========================================================
 * A program that simulates the launch of a Saturn V moon
 * rocket.
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;

import java.awt.*;

public class SaturnVLaunch extends GraphicsProgram {
	private static final double ROCKET_WIDTH = 10;
	private static final double ROCKET_HEIGHT = 200;
	
	private static final double ROCKET_ACCELERATION = -0.1;
	private static final double PAUSE_TIME = 1000.0 / 24;
	
	private static final double STAR_RADIUS = 10;
	
	private static final int MIN_STAR_POINTS = 5;
	private static final int MAX_STAR_POINTS = 9;
	
	private static final int NUM_STARS = 20;
	
	public void run() {
		drawBackground();
		GRect rocket = createRocket();
		add(rocket);
		launchRocket(rocket);
	}
	
	private void launchRocket(GRect rocket) {
		double dy = 0;
		while (!rocketInOrbit(rocket)) {
			moveRocket(rocket, dy);			
			pause(PAUSE_TIME);
		}
	}
	
	private void moveRocket(GRect rocket, double dy) {
		rocket.move(0, dy);
		dy += ROCKET_ACCELERATION;
	}
	
	private GRect createRocket() {
		double x = (getWidth() - ROCKET_WIDTH) / 2.0;
		double y = getHeight() - ROCKET_HEIGHT;
		GRect result = new GRect(x, y, ROCKET_WIDTH, ROCKET_HEIGHT);
		result.setFilled(true);
		result.setColor(Color.GRAY);
		
		return result;
	}
	
	private boolean rocketInOrbit(GRect rocket) {
		return rocket.getY() + rocket.getHeight() < 0;
	}
	
	private void drawStar(double x, double y, double radius, int numPoints) {
		for (int i = 0; i < numPoints; i++) {
			/* Compute the angles of the current point and the next point. */
			double theta     =  i      * 2 * Math.PI / numPoints;
			double nextTheta = (i + 2) * 2 * Math.PI / numPoints;
			
			/* Construct a line between those points. */
			GLine line = new GLine(x + radius * Math.cos(theta),
					               y - radius * Math.sin(theta),
					               x + radius * Math.cos(nextTheta),
					               y - radius * Math.sin(nextTheta));
			
			/* Update the line color. */
			line.setColor(Color.BLUE);
			
			/* Display the line. */
			add(line);			
		}
	}
	
	private void drawBackground() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		for (int i = 0; i < NUM_STARS; i++) {
			addStar(rgen);
		}
	}
	
	private void addStar(RandomGenerator rgen) {
		double x = rgen.nextDouble(STAR_RADIUS, getWidth() - STAR_RADIUS);
		double y = rgen.nextDouble(STAR_RADIUS, getHeight() - STAR_RADIUS);
		int numPoints = rgen.nextInt(MIN_STAR_POINTS, MAX_STAR_POINTS);
		drawStar(x, y, STAR_RADIUS, numPoints);
	}
}
