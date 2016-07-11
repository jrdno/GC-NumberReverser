import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Written by Jordan O'Neill July 10, 2016 Prework assignment 1 for Grand Circus
 */

public class NumberReverser {

	public NumberReverser() {

		// intoduction to program for user
		System.out.println("Weclome to the Number Reverser!");
		System.out.println("This program takes a postive whole number and returns it in reverse.\n");

		// call method to get user input
		getInput();
	}

	public static void getInput() {
		// while loop that runs until an long is entered
		while (true) {
			// creates a new scanner each time the while loop executes
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Please enter a positive whole number: ");
				Long userInput = sc.nextLong();

				// checking to see if number is positive
				if (userInput >= 0) {
					// calling reverseNumber method on the user input long
					reverseNumber(userInput);
					sc.close();
					break;
				} else {
					// error message for negative number
					System.out.println("The number you entered is negative. Please enter a positive number.\n");
					continue;
				}

			} catch (InputMismatchException e) {
				// this catch statement catches non-longs and lets the user try
				// again
				System.out.println("Oops. That's not an number. Please try again.\n");
				continue;
			}
		}
	}

	public static void reverseNumber(long number) {

		// converting long input into string
		String tempString = Long.toString(number);

		// creating StringBuilder to easily reverse the tempString
		StringBuilder sb = new StringBuilder(tempString);
		sb.reverse();

		// printing result and hilarious joke
		System.out.println("Your reversed number: " + sb);
		System.out.println("\nThanks for your business.");
		System.out.println("Please enter your credit card number:");
	}
}
