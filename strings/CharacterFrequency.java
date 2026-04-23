package com.strings;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			int freq = 1;
			boolean isFound = false;

			// Check if character already counted
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					isFound = true;
					break;
				}
			}

			// Count frequency
			if (!isFound) {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						freq++;
					}
				}

				System.out.println(s.charAt(i) + " -> " + freq);
			}
		}

		sc.close();
	}
}