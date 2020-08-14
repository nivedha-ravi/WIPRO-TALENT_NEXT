package javaFundamentals;

import java.util.Scanner;

public class Smallest_exact_divisor {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.print(i);
				System.exit(1);
			}
		}
		System.out.print(1);
	}

}
