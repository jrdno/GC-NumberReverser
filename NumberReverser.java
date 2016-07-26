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

		Scanner sc = new Scanner(System.in);
		String userInput;

		System.out.print("Enter a whole number: ");

		while (!sc.hasNextLong()) {
			userInput = sc.next();
			System.out.println("That's not a whole number. Try again.\n");
			System.out.print("Enter a whole number: ");
		}

		userInput = sc.next();
		sc.close();
		this.reverseNumber(userInput);

	}

	public void reverseNumber(String input) {

		// creating StringBuilder to easily reverse the number
		StringBuilder sb = new StringBuilder(input);
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
