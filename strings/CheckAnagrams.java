package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		// Remove spaces and convert to lowercase
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Check length first
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		} else {
			// Convert strings to char arrays
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			// Sort arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			// Compare arrays
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}

		sc.close();
	}
}