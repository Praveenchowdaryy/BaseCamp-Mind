package com.mind.Problem3;

import java.util.Scanner;

public class CircularString {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter first String :");
		String firstString=sc.nextLine();
		firstString=stringValid(firstString);
		System.out.println("Enter second String :");
		String secondString=sc.nextLine();
		secondString=stringValid(secondString);
		boolean checkCircular=getCircularString(firstString,secondString);
		if(checkCircular)
		{
			System.out.println("Both Strings are cicular");
		}
		else
		{
			System.out.println("Both Strings are not circular");
		}

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
	private static boolean getCircularString(String firstString, String secondString) {
		String result=firstString+firstString;
		if(firstString.length()!=secondString.length())
		{
			return false;
		}
		if(result.indexOf(secondString)!=-1)
		{
			return true;
		}
		return false;
	}

}
