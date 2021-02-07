package com.mind.Problem10;

import java.util.Scanner;

public class UniqueString {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String uniqString=sc.nextLine();
		uniqString=stringValid(uniqString);
		if(chechUniq(uniqString)) {
			System.out.println("The String is unique");
		}
		else {
			System.out.println("The string contains duplicates ");
		}

	}
	private static boolean chechUniq(String uniqString) {
		for (int i = 0; i < uniqString.length(); i++) {
			for (int j = i+1; j < uniqString.length(); j++) {
				if(uniqString.charAt(i)==uniqString.charAt(j)) {
					return false;
				}
			}
		}
		return true;
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

}
