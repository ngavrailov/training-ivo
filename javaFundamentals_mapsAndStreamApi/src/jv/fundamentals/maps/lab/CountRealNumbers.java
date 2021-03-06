package jv.fundamentals.maps.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Read a list of real numbers and print them in ascending order along with
 * their number of occurrences.
 * 
 * @author Ivelin Gavrailov
 * @since 05.07.2020
 *
 */
public class CountRealNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] nums = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
		TreeMap<Double, Integer> counts = new TreeMap<>();
		for (double num : nums) {
			counts.putIfAbsent(num, 0);
			counts.put(num, counts.get(num) + 1);
		}
		for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.print(String.format("%s -> %d%n", df.format(entry.getKey()), entry.getValue()));
		}
		scan.close();
	}
}
