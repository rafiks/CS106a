/*
 * File: SaturnVLaunch.java
 * ========================================================
 * A program that simulates the launch of a Saturn V moon
 * rocket.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class SaturnVLaunch extends GraphicsProgram {
	private static final double ROCKET_WIDTH = 10;
	private static final double ROCKET_HEIGHT = 200;
	
	private static final double ROCKET_SPEED = -10;
	private static final double PAUSE_TIME = 1000.0 / 24;
	
	public void run() {
		GRect rocket = createRocket();
		add(rocket);
		
		while (!rocketInOrbit(rocket)) {
			rocket.move(0, ROCKET_SPEED);
			pause(PAUSE_TIME);
		}
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
		return rocket.getY() < 0;
	}
}
