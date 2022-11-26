package LabCard1;

import java.util.Scanner;


public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objp = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = objp.nextInt();
		System.out.println("Enter number 2");
		int b = objp.nextInt();
		int pro = a*b;
		System.out.println("The sum of " + a +" and " + b +" is "+pro);
	}

}
