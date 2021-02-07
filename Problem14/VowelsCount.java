package com.mind.Problem14;

import java.util.Scanner;

public class VowelsCount {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String string=scanner.nextLine();
		string=stringValid(string);
		int vowelsCount=getVowelsCount(string);
		System.out.println("Vowels count : "+vowelsCount);

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
	private static int getVowelsCount(String sentance) {
		int temp = 0;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == 'a' || sentance.charAt(i) == 'e' || sentance.charAt(i) == 'i'
					|| sentance.charAt(i) == 'o' || sentance.charAt(i) == 'u' || sentance.charAt(i) == 'A'
					|| sentance.charAt(i) == 'E' || sentance.charAt(i) == 'I' || sentance.charAt(i) == 'O'
					|| sentance.charAt(i) == 'U') {
				temp++;
			}
		}
		return temp;
	}

}
