package practiceprojects;

import java.util.Scanner;

public class p01ArithmeticCalculator {

	public static void main(String[] args) {
		
		    char operator;
		    Double num1, num2, outcome;
		
		    Scanner input = new Scanner(System.in);

		    System.out.println("Select an operator: -, +, *, /");
		    operator = input.next().charAt(0);
		    // ask users to enter numbers
		    System.out.println("first number");
		    num1 = input.nextDouble();
		    System.out.println("second number");
		    num2 = input.nextDouble();

		    switch (operator) {

		      // performs addition 
		      case '+':
		        outcome = num1 + num2;
		        System.out.println(num1 + " + " + num2 + " = " + outcome);
		        break;

		      // performs subtraction 
		      case '-':
		        outcome = num1 - num2;
		        System.out.println(num1 + " - " + num2 + " = " + outcome);
		        break;

		      // performs multiplication
		      case '*':
		        outcome = num1 * num2;
		        System.out.println(num1 + " * " + num2 + " = " + outcome);
		        break;

		      // performs division
		      case '/':
		        outcome = num1 / num2;
		        System.out.println(num1 + " / " + num2 + " = " + outcome);
		        break;

		      default:
		        System.out.println("Invalid !");
		        break;
		    }

		    input.close();
		  }
		}
