package com.mind.Problem15;

import java.util.Scanner;

public class RowMultiplication {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter matrix  row size :");
		int rowSize=intValid();
		System.out.println("Enter matrix  col size :");
		int colSize=intValid();
		System.out.println("Enter matrix  elements");
		int[][] matrix=getMatrixElements(rowSize,colSize);
		System.out.println("Result Matrix :");
		int[][] resultMatrix=getResultMatrix(matrix);
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(resultMatrix[i][j]+" ");
			}
			System.out.println();
		}
//		int[] resultMatrix=getResultMatrix(matrix);
//		for (int i = 0; i < resultMatrix.length; i++) {
//			System.out.println(resultMatrix[i]+"");
//		}

	}
	private static int[][] getResultMatrix(int[][] matrix) {
		///int[][] result=new int[matrix.length];
		int temp=1,k=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				temp=temp*matrix[i][j];
			}
			matrix[k][0]=temp;
			temp=1;
			k++;
		}
		return matrix;
//		int[] result=new int[matrix.length];
//		int temp=1,k=0;
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				temp=temp*matrix[i][j];
//			}
//			result[k]=temp;
//			temp=1;
//			k++;
//		}
//		return result;
	}
	private static int[][] getMatrixElements(int row, int col) {
		int[][] temp=new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the value for row " + i + " and " + j);
				temp[i][j] = intValid();
			}
		}
		return temp;
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
