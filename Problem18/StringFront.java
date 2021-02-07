package com.mind.Problem18;

import java.util.Scanner;

public class StringFront {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String string=scanner.nextLine();
		string=stringValid(string);
		System.out.println("Enter a number :");
		int number=intValid();
		String firstString=getFirstString(string);
		for (int i = 0; i < number; i++) {
			System.out.print(firstString);
		}

	}
	private static String stringValid(String data) {
		while (!data.matches("[a-zA-Z\\s]+")) {
			if (!data.isEmpty()) {
				System.out.println("Please retype the alphabetical string");
			}
			data = scanner.nextLine();
		}
		return data;
	}
	private static int intValid() {
		int data = 0;
		boolean validation = false;
		while (validation == false) {
			if (scanner.hasNextInt()) {
				data = scanner.nextInt();
				validation = true;
			} else if (!scanner.hasNextInt()) {
				System.out.println("you didn't type an integer value ! please type an integer");
				scanner.next();
			}
		}
		return data;
	}
	private static String getFirstString(String string) {
		String temp="";
		int length=string.length();
		if(length<=3) {
			return string;
		}
		if(length>3) {
			for (int i = 0; i < 3; i++) {
				temp=temp+string.charAt(i);
			}
		}
		return temp;
	}

}
