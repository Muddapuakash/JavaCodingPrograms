package com.numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<num;i++) {
			System.out.print(a+" ");
			int temp=a+b;
			b=a;
			a=temp;
		}

	}

}
