package com.mind.Problem5;

import java.util.Scanner;

public class StringSquareMatrix {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		boolean temp=true;
		int rowSize = 0,colSize = 0;
		char charMatrix[][]= {};
		do
		{
			System.out.println("choose option");
			System.out.println("=============");
			System.out.println("1.add dimensions");
			System.out.println("2.add characters to matrix");
			System.out.println("3.search string ");
			System.out.println("4.exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter row size :");
			       rowSize=sc.nextInt();
			       System.out.println("Enter col size :");
			       colSize=sc.nextInt();
			       break;
			case 2:charMatrix=getMatrixElements(rowSize,colSize);  
			       break;
			case 3:System.out.println("Enter string :");
			       sc.nextLine();
			       String searchString=sc.nextLine();
			       char charString[]=getCharArray(searchString);
			       if(searchStringMatrix(charMatrix,charString))
			       {
			    	   System.out.println("Is present");
			       }
			       else
			       {
			    	   System.out.println("Not present");
			       }
			       break;
			case 4:temp=false;
			       break;
			}
		}while(temp);
		
	}
	private static boolean searchStringMatrix(char[][] charMatrix, char[] charString) {
		int temp=0,i=0;
		
			for (int j = 0; j < charMatrix.length; j++) {
				for (int k = 0; k < charMatrix[j].length; k++) {
					if(charMatrix[j][k]==charString[i]) {
						temp++;
						i++;
						if (temp == charString.length) {
							return true;
						} 
					}
						
				}
			}
		
			return false;
		
	}
	private static char[] getCharArray(String searchString) {
		char temp[]=new char[searchString.length()];
		for (int i = 0; i < searchString.length(); i++) {
			temp[i]=searchString.charAt(i);
		}
		return temp;
	}
	private static char[][] getMatrixElements(int rowSize, int colSize) {
		char matrix[][]=new char[rowSize][colSize];
		System.out.println("Enter characters :");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=sc.next().charAt(0);
			}
		}
		/*
		 * for(int i=0;i<matrix.length;i++) { for (int j = 0; j < matrix[i].length; j++)
		 * { System.out.println(matrix[i][j]+" "); } }
		 */
		return matrix;
	}

}
