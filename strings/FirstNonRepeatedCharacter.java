package com.strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char result = ' ';
		boolean found = false;

		for (int i = 0; i < str.length(); i++) {
			boolean repeated = false;

			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					repeated = true;
					break;
				}
			}

			if (!repeated) {
				result = str.charAt(i);
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(result);
		} else {
			System.out.println("No non-repeated character found");
		}

		sc.close();
	}
}