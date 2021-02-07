package com.mind.Demo;

public class CharStack {
	private int max;
	private char array[];
	private int top;

	public CharStack(int len) {
		this.max=len;
		this.top=-1;
		array=new char[max];
	}

	public boolean push(char ch) {
		 if (top >= (max - 1)) {
	            System.out.println("Overflow");
	            return false;
	        }
	        else {
	            top++;
	        	array[top] = ch;
	            return true;
	        }
	}

	public char topElem() {
		if(top<0) {
			System.out.println("Underflow");
			return 0;
		}else {
			return array[top];
		}
	}

	public char pop() {
		if(top<0) {
			System.out.println("Underflow");
			return 0;
		}else {
			return array[top--];
		}
	}

	public int size() {
	
		return top;
	}

}
