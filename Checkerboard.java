/* 
 * File: Checkboard.java
 * 
 * A checkerboard program that *doesn't* use Karel!
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {
	private static final int BOARD_SIZE = 8;
		
	public void run() {
		double squareSize = getHeight() / BOARD_SIZE;
		
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				double x = col * squareSize;
				double y = row * squareSize;
				
				GRect square = new GRect(x, y, squareSize, squareSize);
				square.setFilled(true);
				
				if ((x + y) % 2 == 0) {
					square.setColor(Color.WHITE);
				} else {
					square.setColor(Color.ORANGE);
				}
				
				add(square);
			}
		}
	}
}
