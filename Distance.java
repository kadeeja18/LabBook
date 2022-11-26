package LabCard1;

import java.util.Scanner;

public class Distance {
public static void main(String[] args) {
	 float u,t, a, s;
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter the value of initial velocity,u");
      u = obj.nextFloat();
		 System.out.println("Enter the value of time,t");
		 t= obj.nextFloat();
	 System.out.println("Enter the value of acceleration,a");
	 a=obj.nextFloat();
	 s=u*t+(1/(2*a));
	 System.out.println("The distance is "+s);
}
}
