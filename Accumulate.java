/*
 * File: Accumulate.java
 * ==========================================
 * A program that reads and accumulates numbers from the user.
 * 
 */
import acm.program.*;

public class Accumulate extends ConsoleProgram {

	private static final int SENTINEL = 0;
	
	public void run() {
		/* Track the total so far. */
		int total = 0;
		
		/* Continuously add new values into the total. */
		while (true) {
			int toAdd = readInt("Enter next integer: ");	
			if (toAdd == SENTINEL) {
				break;
			}
			
			total += toAdd;
			
			println("The total so far is " + total);	
		}
	}
}
