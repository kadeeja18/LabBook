package LabCard1;

public class SwapNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		int b = 23;
		System.out.println("The values before swapping "+ "a = " +a + ",b= "+b);
        a = (a * b) / (b = a);

		System.out.println("The values after swapping "+ "a = " +a + ",b= "+b);
	}

}
