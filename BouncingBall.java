/*
 * File: BouncingBall.java
 * ========================================================
 * A program that simulates a bouncing ball
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;

import java.awt.*;

public class BouncingBall extends GraphicsProgram {
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
		while (true) {
			GOval ball = createBall();
			add(ball);
			bounceBall(ball);
			removeAll();
		}
	}
	
	private void displayParameters(double gravity, double elasticity) {
		GLabel data = new GLabel("Gravity: " + gravity + "; Elasticity: " + elasticity);
		data.setFont("Monospace-24");
		data.setLocation(0, data.getAscent());
		add(data);
	}
	
	private void bounceBall(GOval ball) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		double dx = 5;
		double dy = 0;
		double gravity = 1.0;
		double elasticity = 1.2;
		
		displayParameters(gravity, elasticity);
		
		while (ballOnScreen(ball)) {
			ball.move(dx, dy);
			
			if (ballHitGround(ball)) {
				//unstickBall(ball);
				dy *= -elasticity;
			} else {
				dy += gravity;
			}
			
			pause(1000.0 / 36);
		}
	}
	
	private void unstickBall(GOval ball) {
		ball.move(0, getHeight() - (ball.getY() + ball.getHeight()));
	}
}
