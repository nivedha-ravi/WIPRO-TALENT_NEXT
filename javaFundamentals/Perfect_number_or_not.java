package javaFundamentals;

import java.util.Scanner;

public class Perfect_number_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		System.out.print((sum==n)?"Perfect Number":"Not a Perfect Number");

	}

}
