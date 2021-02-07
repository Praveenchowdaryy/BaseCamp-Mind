package com.mind.Problem22;

import java.util.Scanner;

public class ArrayArangement {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of an array :");
		int arraySize=intValid();
		int array[]=getArrayElements(arraySize);
		int resultArray[]=getResultArray(array);
		System.out.println("The result array :");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i]);
		}

	}
	private static int[] getResultArray(int[] array) {
		int index=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==3 && array[i+1]!=4) {
				index=getFourIndex(index+1,array);
				array[index]=array[i+1];
				array[i+1]=4;
			}
		}
		return array;
	}
	private static int getFourIndex(int index, int[] array) {
		for(int temp=index;temp<array.length;temp++) {
			if(array[temp]==4) {
				return temp;
			}
		}
	
		return 0;
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
