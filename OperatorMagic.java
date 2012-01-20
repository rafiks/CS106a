/* File: OperatorMagic.java
 * 
 * A program that lets us see the magic and mystery of operators!
 */
import acm.program.*;

public class OperatorMagic extends ConsoleProgram {
	public void run() {
		println("This program computes the average of two integers.");
		int first = readInt("Enter an integer: ");
		int second = readInt("Enter an integer: ");
		double average = (first + second) / 2;
		println("The average is " + average + ".");
	}
}
