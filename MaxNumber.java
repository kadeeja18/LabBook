package LabCard1;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1;
		double number2;
Scanner input = new Scanner(System.in);
	System.out.println("enter the number 1");
	number1 = input.nextDouble();
	System.out.println("enter the number 2");
	number2 = input.nextDouble();
	double maxi = Math.max(number1,number2);
	System.out.println("The maximum of the two numbers is " + maxi);
	}

	}


