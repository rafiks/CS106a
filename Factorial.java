/*
 * File: Factorial.java
 * ================================================================
 * A program that shows off computing factorials
 */
import acm.program.*;

public class Factorial extends ConsoleProgram {
	public void run() {
		int result = 1;
		for (int i = 1; i <= 10; i++) {
			result *= i;
		}
		
		println("10! = " + result);
	}
}
