package com.strings;

import java.util.Scanner;

public class OnlyDigitsCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		boolean isDigitOnly = true;

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				isDigitOnly = false;
				break;
			}
		}

		if (isDigitOnly) {
			System.out.println("String contains only digits");
		} else {
			System.out.println("String does not contain only digits");
		}

		sc.close();
	}
}