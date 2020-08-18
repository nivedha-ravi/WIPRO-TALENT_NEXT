package javaFundamentals;

import java.util.Scanner;

public class Strong_number_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			sum+=Factorial(n%10);
			n/=10;
		}
		System.out.print((sum==temp)?"Strong Number":"Not a Strong Number");
		}

	public static long Factorial(int n) {
		long fact=1;
		for(long i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}

}
