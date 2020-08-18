package javaFundamentals;

import java.util.Scanner;

public class Character_corresponding_ascii_values {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println((char)(a[i]));
		}
		

	}

}
