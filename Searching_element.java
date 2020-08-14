package javaFundamentals;

import java.util.Scanner;

public class Searching_element {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int x=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				System.out.print("Element found at index: "+i);
				return;
			}
		}
		System.out.print("-1");

	}

}
