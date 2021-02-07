package com.mind.Problem23;

import java.util.Scanner;

public class InnerOuterArrays {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of an array 1:");
		int firstArraySize=intValid();
		int innerArray[]=getArrayElements(firstArraySize);
		System.out.println("Enter size of an array 2:");
		int secondArraySize=intValid();
		int outerArray[]=getArrayElements(secondArraySize);
		if(checkInnerOuterArrays(innerArray,outerArray)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}
	private static boolean checkInnerOuterArrays(int[] innerArray, int[] outerArray) {
		int temp=0;
		for (int i = 0; i < outerArray.length; i++) {
			for (int j = 0; j < innerArray.length; j++) {
				if(outerArray[i]==innerArray[j]) {
					temp++;
				}
			}
		}
		if(temp>=outerArray.length) {
			return true;
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
