package com.mind.Problem9;

import java.util.Scanner;

public class OnesCount {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		int number=intValid();
		number=probValid(number);
		long count=getOnesCount(number);
		System.out.println("The count is ");
		System.out.println(count);
		

	}
	private static int probValid(int number) {
		if (number % 2 == 0 || number % 5 == 0) {
			System.out.println("Please enter valid number :");
			number = sc.nextInt();
		} else {
			return number;
		}

		return number;
	}
	private static long getOnesCount(int number) {
		long temp=1,flag=10,count=1;
		while(temp%number!=0) {
			temp=temp+flag;
			flag=flag*10;
			count++;
		}
		return count;
	}
	private static int intValid() {
		int data = 0;
		boolean validation = false;
		while (validation == false) {
			if (sc.hasNextInt()) {
				data = sc.nextInt();
				validation = true;
			} else if (!sc.hasNextInt()) {
				System.out.println("you didn't type an integer value ! please type an integer");
				sc.next();
			}
		}
		return data;
	}

}
