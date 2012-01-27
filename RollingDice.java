/*
 * File: RollingDice.java
 * =======================================================
 * A program that shows how to roll dice with
 * RandomGenerator.
 */
import acm.program.*;
import acm.util.*;

public class RollingDice extends ConsoleProgram {
	public void run() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		int roll1 = rgen.nextInt(1, 6);
		int roll2 = rgen.nextInt(1, 6);
		println("We rolled a " + roll1 + " and a " + roll2 + ".");
	}
}
