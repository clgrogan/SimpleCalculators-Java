package com.calculators;

import java.util.Scanner;

public class AreaOfTriangle {
//	Console program which meets the following requirements:
//		1. Program starts and asks user to enter length of side A of the triangle.
//		2. Program asks user to enter length of side B of the triangle.
//		3. Program asks user to enter length of side C of the triangle.
//		4. Calculate the area of the triangle using The Heron's formula.
//		5. Display the result, if it is not valid display NaN.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program calculates the aread of a triangle.");
		
		System.out.print("Please, enter A side of a triangle: ");
		double a = sc.nextDouble();

		System.out.print("Please, enter B side of a triangle: ");
		double b = sc.nextDouble();

		System.out.print("Please, enter C side of a triangle: ");
		double c = sc.nextDouble();
		
		double p = (a + b + c) / 2;

		double triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Triangle area is: " + triangleArea); 
	}

}
