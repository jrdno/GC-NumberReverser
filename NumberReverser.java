import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberReverser {

	public NumberReverser() {

		// introduction to program for user
		System.out.println("Weclome to the Number Reverser!");
		System.out.println("This program takes a whole number and returns it in reverse.\n");

		// call method to get user input
		this.getInput();
	}

	public void getInput() {
		// while-loop that runs until a long is entered
		while (true) {
			// creates a new scanner each time the while loop executes
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Please enter a whole number: ");
				Long userInput = sc.nextLong();

				// call the reverseNumber method to flip number and print result
				this.reverseNumber(userInput);
				sc.close();
				break;

			} catch (InputMismatchException e) {
				// this catches non-longs and lets the user try again
				System.out.println("Oops. That's not an number. Please try again.\n");
				continue;
			}
		}
	}

	public void reverseNumber(long number) {

		// converting long input into string
		String tempString = Long.toString(number);

		// creating StringBuilder to easily reverse the tempString
		StringBuilder sb = new StringBuilder(tempString);
		int len = sb.length();
		sb.reverse();

		// accommodating negative numbers, need to shift the '-' if negative
		if (sb.charAt(len - 1) == '-') {
			System.out.println("Your reversed number: " + "-" + sb.substring(0, len - 1));
		} else {
			System.out.println("Your reversed number: " + sb);
		}
	}
}
