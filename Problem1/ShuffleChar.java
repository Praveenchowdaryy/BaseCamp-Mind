package com.mind.Problem1;

import java.util.Scanner;

public class ShuffleChar {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ShuffleChar s = new ShuffleChar();
		System.out.println("Enter a String :");
		String string = sc.nextLine();
		string=stringValid(string);
		String revString = getRevString(string);
		String resultString = s.getResultString(revString);
		System.out.println("The result String :");
		System.out.println(resultString);

	}

	private static String stringValid(String data) {
		while (!data.matches("[a-zA-Z\\s]+")) {
			if (!data.isEmpty()) {
				System.out.println("Please retype the alphabetical string");
			}
			data = sc.nextLine();
		}
		return data;
	}

	private static String getRevString(String string) {
		String temp = "";
		int length = string.length();
		int a = 0, b = 1;
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {

				temp = temp + string.charAt(a);
				a++;
			}
			if ((i % 2) != 0) {
				temp = temp + string.charAt(length - b);
				b++;
			}

		}
		return temp;
	}

	private String getResultString(String string) {
		String temp = "";
		int length = string.length();
		for (int i = 0; i < length; i++) {

			if ((i % 2) == 0) {
				int ch = string.charAt(i);
				if (ch > 64 && ch < 91) {
					ch = ch + 32;
				}
				temp = temp + (char) ch;
			} else {
				int ch = string.charAt(i);
				if (ch > 96 && ch < 123) {
					ch = ch - 32;
				}

				temp = temp + (char) ch;
			}
		}
		return temp;
	}

}
