package javaFundamentals;

import java.util.Scanner;

public class Number_sum_of_two_prime_nos {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int k=0;
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				a[k++]=i;
			}
		}
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.format("Sum of %d and %d is %d",a[i],a[j],n);
					return;
				}
			}
		}
		System.out.print("-1");

	}

	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
