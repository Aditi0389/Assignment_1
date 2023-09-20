package com.org.radical;

public class Number_Swap {
	public static void main(String args[])
	{
		int a = 10;
		int b = 29;
		System.out.println("a before swap is :"+a);
		System.out.println("b before swap is :"+b);
		a= a+b;
		b = a-b;
		a = a-b;
		System.out.println("a after swap is :"+a);
		System.out.println("b after swap is :"+b);
		
	}

}
