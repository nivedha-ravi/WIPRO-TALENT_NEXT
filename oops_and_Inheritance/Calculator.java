package oops_and_Inheritance;

import java.util.Scanner;

public class Calculator {
	public static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println(powerInt(in.nextInt(), in.nextInt()));
		System.out.println(powerDouble(in.nextDouble(), in.nextInt()));

	}

}
