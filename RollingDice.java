/*
 * File: RollingDice.java
 * =======================================================
 * A program that shows how to roll dice with
 * RandomGenerator.
 */
import acm.program.*;
import acm.util.*;      // <--- Note the new import

public class RollingDice extends ConsoleProgram {
	public void run() {
		/* Obtain an instance of the random generator. */
		RandomGenerator rgen = RandomGenerator.getInstance();
		
		/* Roll the dice twice. */
		int roll1 = rgen.nextInt(1, 6);
		int roll2 = rgen.nextInt(1, 6);
		
		/* Print out the result.
		println("We rolled a " + roll1 + " and a " + roll2 + ".");
	}
}
