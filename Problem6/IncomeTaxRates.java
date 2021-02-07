package com.mind.Problem6;

import java.util.Scanner;

public class IncomeTaxRates {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter employee name :");
		String employeeName=sc.nextLine();
		employeeName=stringValid(employeeName);
		System.out.println("Enter employee salary :");
		double employeeSalary=doubleValidate();
		double incomeTax=getIncomeTax(employeeSalary);
		System.out.println("Emp Name :"+employeeName);
		System.out.println("Emp incomeTax :"+incomeTax);

	}

	private static double doubleValidate() {
		double data = 0;
		boolean validation = false;
		while (validation == false) {
			if (sc.hasNextDouble()) {
				data = sc.nextDouble();
				validation = true;
			} else if (!sc.hasNextDouble()) {
				System.out.println("you didn't type double value ! please type valid input");
				sc.next();
			}
		}
		return data;
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

	private static double getIncomeTax(double employeeSalary) {
	
		if(employeeSalary<=50000)
		{
			return 0;
		}
		if(employeeSalary>50000 && employeeSalary<=60000)
		{
			return employeeSalary/10;
		}
		if(employeeSalary>60000 && employeeSalary<=150000)
		{
			return (employeeSalary/100)*2;
			
		}
		if(employeeSalary>150000 )
		{
			return (employeeSalary/100)*3;
		}
		return 0;
	}

}
