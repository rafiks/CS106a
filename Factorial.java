/*
 * File: Factorial.java
 * ================================================================
 * A program that shows off computing factorials
 */
import acm.program.*;

public class Factorial extends ConsoleProgram {

	public void run() {
		int result1 = factorial(10);
		println("10! = " + result1);
		
		int result2 = factorial(13);
		println("13! = " + result2);
	}
	
	private int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
	}
}
