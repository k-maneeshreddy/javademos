package practiceprojects;

import java.util.Scanner;

public class p01ArithmeticCalculator {

	public static void main(String[] args) {
		
Scanner scr = new Scanner(System.in);
		
		System.out.println("Select an operator : +,-,*,/");
		char operator=scr.next().charAt(0);
		
		System.out.println("first number");
		double num1=scr.nextDouble();
		
		System.out.println("second number");
		double num2=scr.nextDouble();
		
		double Outcome;
		
		switch(operator)
		{
		case'+':
				Outcome=num1+num2;
				System.out.println(num1+"+"+num2+"="+Outcome);
				break;
			case'-':
				Outcome=num1+num2;
				System.out.println(num1+"-"+num2+"="+Outcome);
				break;
			case'*':
				Outcome=num1+num2;
				System.out.println(num1+"*"+num2+"="+Outcome);
				break;
			case'/':
				Outcome=num1+num2;
				System.out.println(num1+"/"+num2+"="+Outcome);
				break;
			default:
				System.out.println("invalid");
				break;
		}
		
	}

}

