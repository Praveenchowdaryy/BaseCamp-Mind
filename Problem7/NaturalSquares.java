package com.mind.Problem7;

import java.util.Scanner;

public class NaturalSquares {

	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of set :");
		int size = sc.nextInt();
		size = sizeValid(size);
		int naturalNumbers[] = getNumbers(size);
		int naturalSquires[] = getSquares(naturalNumbers);
		if (checkException(naturalSquires)) {
			System.out.println("Error ! Range overflow");
		} else {
			System.out.println("the result set : ");
			for (int x : naturalSquires) {
				System.out.print(x + " ");
			}
		}

	}

	private static boolean checkException(int[] naturalSquires) {
		for (int i = 0; i < naturalSquires.length; i++) {
			if (naturalSquires[i] > 100) {
				return true;
			}
		}
		return false;
	}

	private static int sizeValid(int size) {
		while(size>10)
		{
			System.out.println("Error ! Size must be 10 or below ,Enter again");
			size = sc.nextInt();
		}
		
		return size;
	}

	private static int[] getSquares(int[] naturalNumbers) {
		int[] temp = new int[naturalNumbers.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = naturalNumbers[i] * naturalNumbers[i];
		}
		return temp;
	}

	private static int[] getNumbers(int size) {
		int[] temp = new int[size];
		System.out.println("enter natural numbers :");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextInt();
		}
		return temp;
	}

}
