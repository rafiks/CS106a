/*
 * File: Factorial.java
 * ================================================================
 * A program that shows off computing factorials
 */
import acm.program.*;

public class Factorial extends ConsoleProgram {

	private static final int MAX_NUM = 15;
	
	public void run() {
		for (int j = 0; j < MAX_NUM; j++) {
			int result = factorial(j);
			println(j + "! = " + result);
		}
	}
	
	private int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
