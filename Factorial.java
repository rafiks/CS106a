/*
 * File: Factorial.java
 * ================================================================
 * A program that shows off computing factorials
 */
import acm.program.*;

public class Factorial extends ConsoleProgram {
	private int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
	
	public void run() {
		int result1 = factorial(10);
		println("10! = " + result);
		
		int result2 = factorial(13);
		println("13! = " + result);
	}
}
