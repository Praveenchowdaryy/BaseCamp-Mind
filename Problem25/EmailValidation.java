package com.mind.Problem25;

import java.util.Scanner;

public class EmailValidation {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Email :");
		String emailId=scanner.nextLine();
		emailId=emailValid(emailId);
		int noOfUpperCases=getUpperCases(emailId);
		int noOfLowerCases=getLowerCases(emailId);
		int noOfDigits=getDigits(emailId);
		int emailLength=getEmailLength(emailId);
		double upperCasePercent=getUpperCasePercent(noOfUpperCases,emailLength,emailId);
		double lowerCasePercent=getLowerCasePercent(noOfLowerCases,emailLength,emailId);
		double digitsPercent=getDigitsPercent(noOfDigits,emailLength,emailId);
		System.out.println("Percentage of Uppercase letters :"+upperCasePercent+"%");
		System.out.println("Percentage of Lowercase letters :"+lowerCasePercent+"%");
		System.out.println("Percentage of Digits :"+digitsPercent+"%");
	}
	private static int getEmailLength(String emailId) {
		int count=0;
		for (int i = 0; i < emailId.length(); i++) {
			if(emailId.charAt(i)!='.') {
				count++;
			}
		}
		return count;
	}
	private static double getDigitsPercent(int noOfDigits, int length, String emailId) {
		double percent=(noOfDigits*100)/length;
		return percent;
	}
	private static double getLowerCasePercent(int noOfLowerCases, int length, String emailId) {
		double percent=(noOfLowerCases*100)/length;
		return percent;
	}
	private static double getUpperCasePercent(int noOfUpperCases, int length, String emailId) {
		double percent=(noOfUpperCases*100)/length;
		return percent;
	}
	private static int getDigits(String emailId) {
		char ch;
		int count=0;
		for (int i = 0; i < emailId.length(); i++) {
			ch=emailId.charAt(i);
			int temp=ch;
			if(temp>=48 && temp<=57) {
				count++;
			}
		}
		return count;
	}
	private static int getLowerCases(String emailId) {
		char ch;
		int count=0;
		for (int i = 0; i < emailId.length(); i++) {
			ch=emailId.charAt(i);
			int temp=ch;
			if(temp>=97 && temp<=122) {
				count++;
			}
		}
		return count;
	}
	private static int getUpperCases(String emailId) {
		char ch;
		int count=0;
		for (int i = 0; i < emailId.length(); i++) {
			ch=emailId.charAt(i);
			int temp=ch;
			if(temp>=65 && temp<=90) {
				count++;
			}
		}
		return count;
	}
	private static String emailValid(String emailId) {
		int length=emailId.length();
		for (int i = 0; i < length; i++) {
			if(emailId.indexOf('@')>0 && emailId.indexOf('@')<length-1) {
				return emailId;
			}else {
				System.out.println("Enter a valid email (wrt @) :");
				emailId=scanner.nextLine();
			}
		}
		return emailId;
	}

}
