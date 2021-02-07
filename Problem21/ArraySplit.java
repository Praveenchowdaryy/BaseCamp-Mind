package com.mind.Problem21;

import java.util.Scanner;

public class ArraySplit {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of an array :");
		int arraySize=intValid();
		int array[]=getArrayElements(arraySize);
		if(checkSplitSum(array)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		

	}
	private static boolean checkSplitSum(int[] array) {
		int leftSpanSum = 0;

		for (int i = 0; i < array.length; i++) {
			leftSpanSum =leftSpanSum + array[i];
			int rightSpanSum = 0;
			for (int j = i + 1; j < array.length; j++) {
				rightSpanSum =rightSpanSum + array[j];
			}
			if (leftSpanSum == rightSpanSum) {
				return true;
			}

		}
		return false;
	}
	private static int[] getArrayElements(int arraySize) {
		int array[]=new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element "+(i+1));
			array[i]=intValid();
		}
		return array;
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
