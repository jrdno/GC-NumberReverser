import java.util.Scanner;

public class NumberReverser {

	public NumberReverser() {
		System.out.println("Weclome to the Number Reverser!");
		System.out.println("This program takes a whole number and returns it in reverse.\n");
		
		this.reverseNumber(this.getInput());
		//this.remainderReverse(this.getInput());
	}

	private String getInput() {
		// create scanner to collect input and a result string
		Scanner sc = new Scanner(System.in);
		String userInput = null;

		System.out.print("Enter a whole number: ");

		// this will run once there is an input
		while (sc.hasNext()) {
			if (sc.hasNextLong()) {
				userInput = sc.next();
				break;
			}
			// advances scanner, allows for new input
			sc.next();
			System.out.println("That is not a whole number. Try again. \n");
			System.out.print("Enter a whole number: ");
		}
		sc.close();
		return userInput;
	}

	private void reverseNumber(String input) {
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

	/*
	 * Created this method to reverse the number using math rather than
	 * StringBuilder
	 */

	private void remainderReverse(String str) {
		int len = 0;

		if (str.charAt(0) == '-') {
			len = str.length() - 1;
		} else {
			len = str.length();
		}

		Long num = Long.decode(str);
		Long result = (long) 0;

		for (int i = 0; i < len; i++) {
			Long temp = num % 10;
			result = (result * 10) + temp;
			num /= 10;
		}
		System.out.println("Your reversed number: " + result);
	}
}
