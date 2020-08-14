package javaFundamentals;

import java.util.Scanner;

public class Percentage_and_Grade {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m1=in.nextInt();
		int m2=in.nextInt();
		int m3=in.nextInt();
		int m4=in.nextInt();
		int m5=in.nextInt();
		double total=(m1+m2+m3+m4+m5)/5.0;
		double per=(total*100)/100.0;
		if(per>=90)
		{
			System.out.print("Grade A");
		}
		else if(per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per>=70)
		{
			System.out.print("Grade C");
		}
		else if(per>=60)
		{
			System.out.println("Grade D");
		}
		else if(per>=50)
		{
			System.out.println("Grade E");
		}
		else if(per>=40)
		{
			System.out.println("Grade F");
		}
		else 
		{
			System.out.print("No Grade");
		}
	}

}
