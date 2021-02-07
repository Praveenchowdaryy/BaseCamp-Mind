package com.mind.Problem24;

import java.util.Scanner;

public class MatrixSuperiorIndex {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter row size of matrix :");
		int rowSize=intValid();
		System.out.println("Enter col size of matrix :");
		int colSize=intValid();
		int matrix[][]=getMatrixElements(rowSize,colSize);
		int superiorElement=getSuperiorElement(matrix);
		int rowIndex=getRowIndex(superiorElement,matrix);
		int colIndex=getColIndex(superiorElement,matrix);
		System.out.println("The superior element index is :"+"("+rowIndex+","+colIndex+")");

	}
	private static int getColIndex(int superiorElement, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(superiorElement==matrix[i][j]) {
					return j;
				}
			}
		}
		return -1;
	}
	private static int getRowIndex(int superiorElement, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(superiorElement==matrix[i][j]) {
					return i;
				}
			}
		}
		return -1;
	}
	private static int getSuperiorElement(int[][] matrix) {
		int matrixArray[]=new int[matrix.length*matrix[0].length];
		int k=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrixArray[k]=matrix[i][j];
				k++;
			}
		}
		int largest=matrixArray[0];
		for(int num:matrixArray) {
			if(largest<num) {
				largest=num;
			}
		}
		return largest;
	}
	private static int[][] getMatrixElements(int rowSize, int colSize) {
		int matrix[][]=new int[rowSize][colSize];
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.println("Enter matrix "+"("+i+","+j+")"+"element :");
				matrix[i][j]=intValid();
			}
		}
		return matrix;
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
