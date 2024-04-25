package com.java;

import java.util.Scanner;

public class RevNum {

	static int reverseNum(int num) {
		
		int reverse = 0;
		
		while (num > 0) {
		int rem = num % 10;
		reverse = (reverse * 10) + rem;
		num = num / 10;
		}
		return reverse;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  :");
			int num  = sc.nextInt();
			int revResult = reverseNum(num);
			System.out.println("Reverse of the number "+num+" is "+revResult);
		
		
	}
}
