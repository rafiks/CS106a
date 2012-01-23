/*
 * File: AverageTwoNumbers
 * 
 * A program that reads and averages two numbers from the user.
 */
import acm.program.*;

public class AverageTwoNumbers extends ConsoleProgram {
	public void run() {
		println(6 - (5 / 3 * 2) + 7 % 3);
		/* Read two values from the user. */
		int n1 = readInt("Enter an integer: ");
		int n2 = readInt("Enter another integer: ");
		
		/* Compute their average. */
		double average = (n1 + n2) / 2;
		
		/* Display the value to the user. */
		println("The average is " + average);
	}
}
