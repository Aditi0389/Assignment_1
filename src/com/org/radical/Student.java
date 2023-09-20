/**
 * 
 */
package com.org.radical;

import java.util.Scanner;

/**
 * 
 */
public class Student {
	public static void main(String[] args) {
		String name;
		int marks1;
		int marks2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name");
		name = sc.next();
		System.out.println("Student Name is "+name);
		
		System.out.println("Enter student Marks1");
		marks1 =  sc.nextInt();
		
		System.out.println("Enter student Marks2");
		marks2 =  sc.nextInt();
		
		int sum = marks1+marks2;
		int difference = marks1-marks2;
		int product = marks1*marks2;
		int division = marks1/marks2;
		System.out.println("Sum is "+sum);
		System.out.println("Difference is "+difference);
		System.out.println("Product is "+product);
		System.out.println("Division is "+division);
		sc.close();
		

	}

}
