package com.mind.Problem16;

import java.util.Scanner;

public class PrimeArray {

	static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter size of array :");
		int arraySize=intValid();
		System.out.println("Enter array elements :");
		int[] array=getArrayElements(arraySize);
		int[] primeArray=getPrimeArray(array);
		System.out.println("Prime Array :");
		for (int i = 0; i < primeArray.length; i++) {
			if(primeArray[i]!=0) {
				System.out.print(primeArray[i]+" ");
			}
		}

	}
	private static int[] getPrimeArray(int[] array) {
		int[] prime=new int[array.length];
		int k=0;
		for (int i = 0; i < array.length; i++) {
			int temp=0;
			for (int j = 2; j < array[i]; j++) {
				if(array[i]%j==0) {
					temp=1;
					break;
				}
			}
			if(temp==0) {
				prime[k]=array[i];
				k++;
			}
		}
		return prime;
	}
	private static int[] getArrayElements(int arraySize) {
		int[] array=new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the of index "+i);
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
