package jv.fundamentals.methods.lab;

import java.util.Scanner;

/**
 * You are given two values of the same type as input. The values can be of type
 * int, char of String. Create a method getMax() that returns the greater of the
 * two values:
 * 
 * @author Ivelin Gavrailov
 * @since 17.06.2020
 *
 */
public class GreaterOfTwoValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
		String input = scan.nextLine();
		String secondInput = scan.nextLine();
		switch (type.toLowerCase()) {
		case "int": 
			int inputInt = Integer.parseInt(input);
			int secondInputInt = Integer.parseInt(secondInput);
			System.out.println(getMax(inputInt, secondInputInt));
			break;
		case "char": 
			char inputChar = input.charAt(0);
			char secondInputChar = secondInput.charAt(0);
			System.out.println(getMax(inputChar, secondInputChar));
			break;
		case "string":
			System.out.println(getMax(input, secondInput));
			break;
		}
		scan.close();
	}

	private static int getMax(int firstInt, int secondInt) {
		return Math.max(firstInt, secondInt);
	}

	private static char getMax(char firstChar, char secondChar) {
		if (firstChar > secondChar) {
			return firstChar;
		}
		return secondChar;
	}

	private static String getMax(String firstString, String secondString) {
		if (firstString.compareTo(secondString) >= 0) {
			return firstString;
		}
		return secondString;
	}
}
