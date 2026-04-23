package com.numbers;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numeber: ");
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		while(num!=0) {
			int lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		System.out.println("the sum of digits "+original+" is "+sum);

	}

}
