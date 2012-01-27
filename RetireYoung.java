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
		accountBalance = getRichQuick();
		println("Now I have $" + accountBalance);
	}
	
	/**
	 * A method that (allegedly!) makes us have ten million
	 * dollars!
	 * 
	 * @param money Your initial money.
	 */
	private int getRichQuick() {
		/* Now I have ten million dollars! */
		return 10000000;
	}
}
