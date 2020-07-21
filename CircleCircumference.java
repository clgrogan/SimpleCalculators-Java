package com.calculators;

import java.util.Scanner;


public class CircleCircumference {

	public static void main(String[] args) {
//	Console program which meets the following requirements:
//		1. Program starts and asks user to enter the circle radius.
//		2. Program calculates the circle circumference.
//		3. Program prints the circle circumference to the console.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the circle radius: ");
		
		double r = sc.nextDouble();
		
		System.out.println("Circle circumference is: " + (2*Math.PI*r));

	}

}
