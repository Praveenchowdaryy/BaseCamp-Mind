package com.mind.Problem19;

import java.util.Scanner;

public class TrippletArray {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of array :");
		int arraySize=intValid();
		int array[]=getArrayElements(arraySize);
		if(checkTripplets(array)) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		
	}

	private static boolean checkTripplets(int[] array) {
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					temp++;
				} else {
					if(temp==3) {
						return true;
					}else {
						temp=0;
					}

				}
				
			}
			temp=0;
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
