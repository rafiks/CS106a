/*
 * File: RetireYoung.java
 * =======================================================
 * A program that will let us retire young (?)
 */
import acm.program.*;

public class RetireYoung extends ConsoleProgram {
	public void run() {
		/* Start with only $137 to my name. */
		int accountBalance = 137;
		println("I used to have $" + 137);
		
		/* Get rich quick with computer science! */
		getRichQuick(accountBalance);
		println("Now I have $" + accountBalance);
	}
}
