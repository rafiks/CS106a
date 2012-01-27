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
	private static final double BALL_RADIUS = 50;
	
	private GOval createBall() {
		GOval result = new GOval(0, 0, BALL_RADIUS, BALL_RADIUS);
		result.setFilled(true);
		result.setColor(Color.BLUE);
		return result;
	}
	
	private boolean ballOnScreen(GOval ball) {
		return ball.getX() < getWidth();
	}
	
	private boolean ballHitGround(GOval ball) {
		return ball.getY() + ball.getHeight() >= getHeight();
	}
	
	public void run() {
		GOval ball = createBall();
		add(ball);
		
		double dx = 3;
		double dy = 0;
		
		while (ballOnScreen(ball)) {
			ball.move(dx, dy);
			dy += 1.0;
			
			if (ballHitGround(ball)) {
				ball.move(0, getHeight() - (ball.getY() + ball.getHeight()));
				dy *= -0.7;
			}
			
			pause(1000.0 / 24);
		}
	}
}
