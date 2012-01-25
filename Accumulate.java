/*
 * File: Accumulate.java
 * ==========================================
 * A program that reads and accumulates numbers from the user.
 * 
 */
import acm.program.*;

public class Accumulate extends ConsoleProgram {
	/* The "sentinel" value meaning that we're done. */
	private static final int SENTINEL = -1;
	
	public void run() {
		/* Track the total so far. */
		int total = 0;
		
		/* Continuously add new values into the total. */
		while (true) {
			int toAdd = readInt("Enter next integer: ");
			
			/* If the sentinel was read, we're done. */
			if (toAdd == SENTINEL)
				break;
			
			total += toAdd;
		}
		
		
		println("The total was " + total);
	}
}
