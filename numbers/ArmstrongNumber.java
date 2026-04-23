package com.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int original = num;
		int temp = num;
		int count = 0;

		// Count number of digits
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}

		temp = num;
		int sum = 0;

		// Calculate sum of digits raised to power count
		while (temp != 0) {
			int digit = temp % 10;
			sum = sum + (int) Math.pow(digit, count);
			temp = temp / 10;
		}

		// Check Armstrong number
		if (sum == original) {
			System.out.println(original + " is an Armstrong Number");
		} else {
			System.out.println(original + " is not an Armstrong Number");
		}

		sc.close();
	}
}