package jv.fundamentals.text.processing.exercise;

import java.util.Scanner;

/**
 * Create a method that takes two strings as arguments and returns the sum of
 * their character codes multiplied (multiply str1[0] with str2[0] and add to
 * the total sum). Then continue with the next two characters. If one of the
 * strings is longer than the other, add the remaining character codes to the
 * total sum without multiplication.
 * 
 * @author Ivelin Gavrailov
 * @since 13.07.2020
 *
 */
public class CharacterMultiplier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		System.out.println(getCharactersTotalSum(input));
		scan.close();
	}

	private static int getCharactersTotalSum(String[] input) {
		String firstString = input[0];
		String secondString = input[1];
		int sum = 0;
		if (firstString.length() >= secondString.length()) {
			sum += getCharactersProduct(firstString, secondString);
		} else {
			sum += getCharactersProduct(secondString, firstString);
		}
		return sum;
	}

	private static int getCharactersProduct(String biggerString, String smallerString) {
		int sum = 0;
		for (int i = 0; i < smallerString.length(); i++) {
			sum += biggerString.charAt(i) * smallerString.charAt(i);
		}
		biggerString = biggerString.substring(smallerString.length());
		for (int i = 0; i < biggerString.length(); i++) {
			sum += biggerString.charAt(i);
		}
		return sum;
	}
}
