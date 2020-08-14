package javaFundamentals;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n,sum=0;
		while(n>0)
		{
			sum+=(n%10)*(n%10)*(n%10);
			n/=10;
		}
		System.out.print((temp==sum)?"Armstrong number":"Not an Armstrong Number");

	}

}
