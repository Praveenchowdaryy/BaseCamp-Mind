package com.mind.Problem11;

import java.util.Scanner;

public class RemoveDup {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String string = sc.nextLine();
		String removeDup = getDeplicat(string);
		String resultString = getResultString(removeDup);
		System.out.println(resultString);

	}

	private static String getResultString(String string) {
		int temp;
		String flag = "";
		char charArray[] = new char[string.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = string.charAt(i);
		}
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = (char) temp;
				}
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			flag = flag + charArray[i];
		}
		return flag;
	}

	private static String getDeplicat(String string) {
		String temp = "";

		char ch[] = new char[string.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = string.charAt(i);
		}
		for (char value : ch) {
			if (temp.indexOf(value) == -1) {
				temp += value;
			}
		}

		return temp;
	}

}
