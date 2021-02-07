package com.mind.Problem17;

import java.util.Scanner;

public class MirrorStrings {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of list :");
		int listSize=intValid();
		scanner.nextLine();
		String stringList[]=getStringList(listSize);
		String mirrorList[]=getMirrorList(stringList);
		String resultList[]=getResultList(stringList,mirrorList);
		System.out.println("Result String List :");
		for (int i = 0; i < resultList.length; i++) {
			System.out.println(resultList[i]);
		}
		

	}
	private static String[] getResultList(String[] stringList, String[] mirrorList) {
		String result[]=new String[stringList.length];
		for (int i = 0; i < result.length; i++) {
			result[i]=stringList[i]+mirrorList[i];
		}
		return result;
	}
	private static String[] getMirrorList(String[] stringList) {
		String reverse[]=new String[stringList.length];
		for (int i = 0; i < reverse.length; i++) {
			reverse[i]=getReverseString(stringList[i]);
		}
		return reverse;
	}
	private static String getReverseString(String string) {
		String temp="";
		for (int i = string.length()-1; i >= 0; i--) {
			temp=temp+string.charAt(i);
		}
		return temp;
	}
	private static String[] getStringList(int listSize) {
		String strings[]=new String[listSize];
		for (int i = 0; i < strings.length; i++) {
			System.out.println("Enter string "+(i+1));
			
			strings[i]=scanner.nextLine();
		}
		return strings;
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


}
