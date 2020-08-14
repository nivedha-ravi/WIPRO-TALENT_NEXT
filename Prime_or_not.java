package javaFundamentals;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n==1)
		{
			System.out.print("NO");
			System.exit(1);
		}
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.print("NO");
				System.exit(1);
			}
		}
		System.out.print("YES");
	}

}
