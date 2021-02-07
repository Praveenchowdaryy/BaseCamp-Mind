package com.mind.Demo;

public class StringEvaluation {

	public static void main(String[] args) {
		
			String str = "(((5*10)/20)+6)";
			System.out.println("The string is"+str);
			System.out.println();
			int len = str.length();
			IntStack operand = new IntStack(len); 
			
			CharStack operator = new CharStack(len);

			for (int i = 0; i < len; i++) {
				char ch = str.charAt(i);
				if (ch == '(') {
					operator.push(ch);
				} else if (isDigit(ch)) {
					String temp = ch + "";
					if (!(i == len - 1)) {
						while (isDigit(str.charAt(i + 1))) {
							temp += str.charAt(i + 1);
							i++;
						}
					}
					System.out.println("num:" + temp);
					int flag=(int) convertToInt(temp);
					operand.push(flag);
					temp = "";
				} else if (ch == ')') {
					while ((char) operator.topElem() != '(') {
						char op = (char) operator.pop();
						int value2 = (int) operand.pop();
						int value1 = (int) operand.pop();
						int res = operation(value1, value2, op);
						operand.push(res);
					}
					operator.pop();
				} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					while (operator.size() > 0 && ((char) operator.topElem()) != '('
							&& precedence(ch) <= (precedence((char) operator.topElem()))) {
						char op = (char) operator.pop();
						int value2 = (int) operand.pop();
						int value1 = (int) operand.pop();
						int res = operation(value1, value2, op);
						operand.push(res);
					}
					operator.push(ch);
				}
			}
			while (operator.size() >= 0) {
				char op = (char) operator.pop();
				int value2 = (int) operand.pop();
				int value1 = (int) operand.pop();
				int res = operation(value1, value2, op);
				operand.push(res);
			}
			System.out.println("\nAns is:" + operand.topElem());


	}

	private static int precedence(char operator) {
		if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		} else {
			return 2;
		}
	}

	private static int operation(int value1, int value2, char operator) {
		if (operator == '+') {
			return value1 + value2;
		} else if (operator == '-') {
			return value1 - value2;
		} else if (operator == '*') {
			return value1 * value2;
		} else if (operator == '/') {
			return value1 / value2;
		}
		return 0;
	}

	private static Object convertToInt(String num) {
		int res = 0;
		for (int i = 0; i < num.length(); i++) {
			res = res * 10 + num.charAt(i) - '0';
		}
		return res;
	}

	private static boolean isDigit(char ch) {
		if (ch > 47 && ch < 58) {
			return true;
		} else
			return false;
	}

}
