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
	private static final double INITIAL_SPEED = 5.0;
	
	public void run() {
		GOval ball = createBall();
		add(ball);
		moveBall(ball);
	}
	
	private GOval createBall() {
		GOval ball = new GOval(0, 0, 50, 50);
		ball.setFilled(true);
		ball.setColor(Color.BLUE);
		return ball;
	}
	
	private void moveBall(GOval ball) {
		double dx = INITIAL_SPEED;
		double dy = 0;
		
		while (ballAboveGround(ball)) {
			ball.move(dx, dy);
			dy += GRAVITY;
			
			pause(PAUSE_TIME);
		}
	}
}
