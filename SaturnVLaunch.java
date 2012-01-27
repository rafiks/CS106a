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
				dy *= -0.8;
			}
			
			pause(1000.0 / 24);
		}
	}
}
