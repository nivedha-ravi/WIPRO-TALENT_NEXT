package javaFundamentals;

import java.util.Scanner;

public class Sum_and_average_of_array_elements {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+(sum/n));
		

	}

}
