package com.mind.Problem12;

import java.util.Scanner;

public class StringEvaluate {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the expression :");
		String expression=scanner.nextLine();
		int intArray[]=new int[expression.length()];
		char charArray[]=getCharArray(expression);
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='(') {
				
			}
		}

	}

	private static char[] getCharArray(char[] charArray) {
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='/') {
				int value=getValue(i,charArray);
			}
		}
		return null;
	}

	private static int getValue(int i, char[] charArray) {
		char front=charArray[i-1];
		char back=charArray[i+1];
		int frontDigit=front-48;
		int backDigit=back-48;
		//int result=
		return 0;
	}

	private static char[] getCharArray(String expression) {
		char temp[]=new char[expression.length()];
		for (int i = 0; i < expression.length(); i++) {
			temp[i]=expression.charAt(i);
		}
		return temp;
	}

	private static int getResult(String expression) {
		for (int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i)=='^') {
				
			}
		}
		return 0;
	}

}
