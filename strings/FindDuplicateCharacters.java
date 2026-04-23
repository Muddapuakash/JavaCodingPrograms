package com.strings;

import java.util.Scanner;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println("Duplicate characters are:");

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.print(str.charAt(i)+ " ");
					break; // avoid printing same duplicate multiple times
				}
			}
		}

		sc.close();
	}
}