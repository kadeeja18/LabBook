package LabCard1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float principle,time,rate,ratePercent,SI;
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter the value of Principle");
	      principle = obj.nextFloat();
			 System.out.println("Enter the value of time,t");
			 time= obj.nextFloat();
		 System.out.println("Enter the rate of interest");
		 rate=obj.nextFloat();
		 ratePercent =(rate/100);
		 SI = principle *ratePercent * time;
		 System.out.println("The distance is "+SI);
	}

}
