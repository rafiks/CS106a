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
		for (int j = 0; j <= 10; j++) {
			println(j + "! = " + factorial(j));
		}
	}
}
