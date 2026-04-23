package com.numbers;

import java.util.Scanner;

public class ReverseANumber {
	public static int Reverse(int n) {
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=scan.nextInt();
		System.out.println("Reversed Number: "+Reverse(num));

	}
	

}
 