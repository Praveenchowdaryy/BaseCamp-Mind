package com.mind.Problem4;

import java.util.Scanner;

public class CircularStrings {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String string=sc.nextLine();
		string=stringValid(string);
		System.out.println("Enter a number :");
		int number=intValid();
		String cirStrings[]=getCircularStrings(string,number);
		System.out.println("The Cirular Strings are :");
		for(String s:cirStrings) {
			System.out.println(s);
		}

	}
	private static String[] getCircularStrings(String string, int number) {
		String tempStrings[]=new String[string.length()];
		String temp=string+string;
		for (int i = 0; i < string.length(); i++) {
			String part=getSubString(temp,i,i+number); 
			tempStrings[i]=part;
			
		}
		return tempStrings;
	}
	private static String getSubString(String temp, int i, int j) {
		String flag="";
		for (int k = i; k < j; k++) {
			flag=flag+temp.charAt(k);
		}
		return flag;
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
