package com.java;

import java.util.Scanner;

public class ArithmeticOP {

	static int sumOfDigits(int num) {
		String strNum = String.valueOf(num);
		
		int sum = 0;
		while(strNum.length()>=1) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			strNum = String.valueOf(num);
			if(strNum.length() == 1) {
				sum = sum + num;
				break;
			}
		}
		return sum;
		
	}
	static int digitSum(int num) {
		
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int result = sumOfDigits(num);
		System.out.println("Sum of Digits is  "+result);
	}
}
