package LabCard1;

import java.util.Scanner;

public class FinalVelocity {
	public static void main(String[] args) {
		 float u,t, a, v;
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter the value of initial velocity,u");
          u = obj.nextFloat();
 		 System.out.println("Enter the value of time,t");
 		 t= obj.nextFloat();
		 System.out.println("Enter the value of acceleration,a");
		 a=obj.nextFloat();
if(t>0) {
	v=(u+(a*t));
	System.out.println("The value of final velocity is "+v);
}
else {
	System.out.println("ooops!The entered time is negative");
}

	}
	
}
