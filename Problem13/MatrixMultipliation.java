package com.mind.Problem13;

import java.util.Scanner;

public class MatrixMultipliation {

	static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter matrix 1 row size :");
		int row1=intValid();
		System.out.println("Enter matrix 1 col size :");
		int col1=intValid();
		System.out.println("Enter matrix 2 row size :");
		int row2=intValid();
		System.out.println("Enter matrix 2 col size :");
		int col2=intValid();
		System.out.println("Enter matrix 1 elements");
		int[][] matrix1=getMatrixElements(row1,col1);
		System.out.println("Enter matrix 2 elements");
		int[][] matrix2=getMatrixElements(row2,col2);
		System.out.println("The result matrix :");
		int[][] resultMatrix=getResultMatrix(matrix1,matrix2);
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[0].length; j++) {
				System.out.print(resultMatrix[i][j]+" ");
			}
			System.out.println();
		}

	}
	private static int[][] getResultMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] result=new int[matrix1.length][matrix2[0].length];
		for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
		return result;
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
