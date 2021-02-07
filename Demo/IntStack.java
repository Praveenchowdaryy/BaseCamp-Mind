package com.mind.Demo;

public class IntStack {
	private int max;
	private int top;
	private int array[];

	public IntStack(int len) {
		this.max=len;
		array=new int[max];
		this.top=-1;
	}

	public boolean push(int x) {
		if(top>=(max-1)) {
			System.out.println("Overflow");
			return false;
		}else {
			top++;
		
			array[top]=x;
			return true;
		}
		
	}

	public int pop() {
		if(top<0) {
			System.out.println("UnderFlow");
			return 0;
		}else {
			return array[top--];
		}
	}

	public int topElem() {
		if(top<0) {
			System.out.println("Under Flow");
			return 0;
		}else {
			return array[top];
		}
		
	}

}
