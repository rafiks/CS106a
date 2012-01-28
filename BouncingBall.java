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
	public void run() {
		GOval ball = createBall();
		add(ball);
		moveBall(ball);
	}
	
	/* ??? */ createBall() {
		GOval ball = new GOval(0, 0, 50, 50);
		ball.setFilled(true);
		ball.setColor(Color.BLUE);
	}
}
