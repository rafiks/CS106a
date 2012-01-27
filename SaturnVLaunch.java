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
		GOval ball = new GOval(0, 0, 10, 10);
		add(ball);
		
		double dx = 3;
		double dy = 0;
		
		while (ball.getX() + ball.getWidth() < getWidth()) {
			ball.move(dx, dy);
			dy += 1.0;
			
			if (ball.getY() + ball.getHeight() > getHeight()) {
				//ball.move(0, getHeight() - ball.getY() + ball.getHeight());
				dy *= -0.9;
			}
			
			pause(1000.0 / 24);
		}
	}
}
