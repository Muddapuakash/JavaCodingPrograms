package com.strings;

import java.util.Scanner;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			str=str.replace(" ","");
		}
	
		System.out.println(str);

	}

}
