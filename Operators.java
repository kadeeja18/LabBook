package LabCard1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
int b = 20;
System.out.println("Initial values "+"a = "+a+"b = "+b);
//System.out.println("Unary plus Operator");
//a =+10;
//b=-20;

//System.out.println("A value now "+"a = " +a + " b = "+b );
System.out.println("Pre Increment");
++a;
++b;
System.out.println("Value after pre increment "+ "a = "+a+ " b = "+b);
System.out.println("Post Increment");
System.out.println("Value after post increment "+ "a = "+a++ + " b = "+b++);
System.out.println("Value after post increment"+ "a = "+a+ " b = "+b);
System.out.println("PreDecrement");
System.out.println("Value after pre decrement "+ "a = "+--a + " b = "+ --b);
System.out.println("Value after post decrement "+ "a = "+a-- + " b = "+ b--);
System.out.println("Value after post decrement "+ "a = "+a-- + " b = "+ b--);




	}

}
