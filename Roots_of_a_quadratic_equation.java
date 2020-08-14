package javaFundamentals;

import java.util.Scanner;

public class Roots_of_a_quadratic_equation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		double determinant=(b*b)-(4*a*c);
		double squareroot=Math.sqrt(determinant);
		if(determinant>0)
		{
			double firstRoot=(-b+squareroot)/(2*a);
			double secondRoot=(-b-squareroot)/(2*a);
			System.out.println("First Root: "+firstRoot);
			System.out.println("Second Root: "+secondRoot);
		}
		else if(determinant==0)
		{
			System.out.println("Root is: "+(-b+squareroot)/(2*a));
		}
	}

}
