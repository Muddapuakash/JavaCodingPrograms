package com.numbers;

import java.util.Scanner;

public class GCD {
	static int gcd(int a, int b)
    {
        // Everything divides 0
        if(a==0 || b==0) return Math.max(a, b);
        
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print(gcd(a, b));
    }
}
