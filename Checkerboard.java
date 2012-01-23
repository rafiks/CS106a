/* 
 * File: Checkboard.java
 * 
 * A checkerboard program that *doesn't* use Karel!
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {
	private static final int NUM_SQUARES = 8;
	
	public void run() {
		double squareSize = getHeight() / NUM_SQUARES;
		
		for (int x = 0; x < NUM_SQUARES; x++) {
			for (int y = 0; y < NUM_SQUARES; y++) {
				GRect square = new GRect(x * squareSize, y * squareSize,
						                 squareSize, squareSize);
				
				square.setFilled(true);
				if ((x + y) % 2 == 0) {
					square.setColor(Color.ORANGE.darker());
				} else {
					square.setColor(Color.WHITE);
				}
				
				add(square);
			}
		}
	}
}
