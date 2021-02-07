package com.mind.Problem2;

import java.util.Scanner;

public class WordCount {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		boolean temp=true;
		String sentance="";
		do
		{
		
			System.out.println("Select option :");
			System.out.println("==============");
			System.out.println("1.Enter a Sentance");
			System.out.println("2.Show no of Words");
			System.out.println("3.No of Vowels in Sentance");
			System.out.println("4.Array of Words");
			System.out.println("5.Exit");
			int choice=intValid();
			switch(choice)
			{
			
			case 1:System.out.println("Please Enter a Sentance");
			       sc.nextLine();
			       sentance=sc.nextLine();
			       sentance=stringValid(sentance);
			       break;
			case 2:int wordCount=getWordCount(sentance);
			       System.out.println("The no of Words in sentance :");
			       System.out.println(wordCount);
			       break;
			case 3:int noOfVowels=getVowelsCount(sentance);
			       System.out.println("The no of vowels in sentance :");
			       System.out.println(noOfVowels);
			       break;
			case 4:String arrayOfWords[]=getArrayOfWords(sentance);
			       System.out.println("The Array of Words from the Sentence ");
			       for(String s:arrayOfWords)
			       {
			    	   System.out.println(s+" ");
			       }
			       break;
			case 5:temp=false;
			       break;
			}
			
		}while(temp);

	}

	private static String stringValid(String data) {
		while (!data.matches("[a-zA-Z\\s]+")) {
			if (!data.isEmpty()) {
				System.out.println("Please retype the alphabetical string");
			}
			data = sc.nextLine();
		}
		return data;
	}

	private static int intValid() {
		int data = 0;
		boolean validation = false;
		while (validation == false) {
			if (sc.hasNextInt()) {
				data = sc.nextInt();
				validation = true;
			} else if (!sc.hasNextInt()) {
				System.out.println("you didn't type an integer value ! please type an integer");
				sc.next();
			}
		}
		return data;
	}

	private static String[] getArrayOfWords(String sentance) {
		int temp = 1;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == ' ') {
				temp++;
			}
		}
		String tempArray[] = new String[temp];
		String flag = "";
		int j = 0;
		for (int i = 0; i < sentance.length(); i++) {

			flag = flag + sentance.charAt(i);
			if ((sentance.charAt(i) == ' ' && flag != null) || i == sentance.length() - 1) {
				tempArray[j] = flag;
				j++;
				flag = "";
			}
		}
		return tempArray;
	}

	private static int getVowelsCount(String sentance) {
		int temp = 0;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == 'a' || sentance.charAt(i) == 'e' || sentance.charAt(i) == 'i'
					|| sentance.charAt(i) == 'o' || sentance.charAt(i) == 'u' || sentance.charAt(i) == 'A'
					|| sentance.charAt(i) == 'E' || sentance.charAt(i) == 'I' || sentance.charAt(i) == 'O'
					|| sentance.charAt(i) == 'U') {
				temp++;
			}
		}
		return temp;
	}

	private static int getWordCount(String sentance) {
		int temp = 1;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == ' ') {
				temp++;
			}
		}
		return temp;
	}


}
