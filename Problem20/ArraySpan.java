package com.mind.Problem20;

import java.util.Scanner;

public class ArraySpan {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of Array :");
		int arraySize=intValid();
		int array[]=getArrayElements(arraySize);
		int spanSum=getSpanSum(array);
		System.out.println("The result :");
		System.out.println(spanSum);

	}
	private static int getSpanSum(int[] array) {
		/*
		 * int maxSpan=0; int span; for (int i = 0; i < array.length; i++) { for (int k
		 * = array.length-1; array[i]!=array[k] ; k--) { span=1+k-i; if(span>maxSpan) {
		 * maxSpan=span; } } } return maxSpan;
		 */
		int sum=0;
		for (int i = 1; i < array.length-1; i++) {
			sum=sum+array[i];
		}
		return sum;
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
