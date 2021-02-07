package com.mind.Problem11;

import java.util.Scanner;

public class ClockAngle {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter time in format(HH.MM):");
		String time=sc.nextLine();
		int hours=getHours(time);
		int mins=getMins(time);
		int angle=getAngle(hours,mins);
		System.out.println("The angle between two hands :");
		System.out.println(angle);
		
	}
	private static int getAngle(int hours, int mins) {
		int angle,angle2;
		int hoursAngle=(int)(0.5*((hours*60)+mins));
		int minsAngle=(int)6*mins;
		if(hoursAngle>minsAngle) {
			angle=hoursAngle-minsAngle;
		}
		else {
			angle=minsAngle-hoursAngle;
		}
		angle2=360-angle;
		if(angle>angle2) {
			return angle2;
		}else {
			return angle;
		}
		
	}
	private static int getMins(String time) {
		int m1=time.charAt(time.length()-2)-'0';
		int m2=time.charAt(time.length()-1)-'0';
		int min=(m1*10)+m2;
		return min;
	}
	private static int getHours(String time) {
		
		int h1=time.charAt(0)-'0';
		int h2=time.charAt(1)-'0';
		int hour=(h1*10)+h2;
		return hour;
	}

}
