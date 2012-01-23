/*
 * File: AverageTwoNumbers
 * 
 * A program that reads and averages two numbers from the user.
 */
import acm.program.*;

public class AverageTwoNumbers extends ConsoleProgram {
	public void run() {
		int n1 = readInt("Enter an integer: ");
		int n2 = readInt("Enter another integer: ");
		
		double average = (n1 + n2) / 2;
		
		println("The average is " + average);''
	}
}
