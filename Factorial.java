/*
 * File: Factorial.java
 * ================================================================
 * A program that shows off computing factorials
 */
import acm.program.*;

public class Factorial extends ConsoleProgram {
	public void run() {
		int result = factorial(10);
		println("10! = " + result);
	}
}
