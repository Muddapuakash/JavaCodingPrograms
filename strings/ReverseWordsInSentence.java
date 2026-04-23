package com.strings;

import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input sentence
		String s = sc.nextLine();

		// Split sentence into words
		String[] words = s.split(" ");

		// Reverse words using loop
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		sc.close();
	}
}