package LabCard1;

import sun.security.util.Length;

public class LargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a []= {101,5,1,2,36,9,5,6,52,101};
int large = a[0];
for(int i = 0;i<a.length;i++) {
	if(a[i]>large) {
		large=a[i];
	}
}
System.out.println("The largest is " + large);
	}

}
