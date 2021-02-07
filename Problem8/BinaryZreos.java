package com.mind.Problem8;

import java.util.Scanner;

public class BinaryZreos {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter decimal number :");
		int decimal=intValid();
		int zerosCount=getBinaryZeros(decimal);
		System.out.println("No of zeros in that binary :");
		System.out.println(zerosCount);

	}
	private static int getBinaryZeros(int decimal) {
		int i , flag = 0;
		String dupli = "";
		while (decimal > 0) {
			i = decimal % 2;
			decimal = decimal / 2;
			dupli = dupli + i;
			i = 0;

		}
		for (int j = 0; j < dupli.length(); j++) {
			if (dupli.charAt(j) == '0') {
				flag++;
			}
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

}
