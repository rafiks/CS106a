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
		GOval ball = createBall();
		add(ball);
		bounceBall(ball);
	}
	
	private void bounceBall(GOval ball) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		double dx = 5;
		double dy = 0;
		double gravity = rgen.nextDouble(0.3, 1.5);
		double elasticity = rgen.nextDouble(-0.5, -1.1);
		
		while (ballOnScreen(ball)) {
			ball.move(dx, dy);
			
			if (ballHitGround(ball)) {
				unstickBall(ball);
				dy *= elasticity;
			} else {
				dy += gravity;
			}
			
			pause(1000.0 / 24);
		}
	}
	
	private void unstickBall(GOval ball) {
		ball.move(0, getHeight() - (ball.getY() + ball.getHeight()));
	}
}
