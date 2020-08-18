package javaFundamentals;

import java.util.Scanner;

public class Count_the_even_and_odd_in_an_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int even=0,odd=0;
		for(int i=0;i<n;i++)
		{
			int a=in.nextInt();
			if(a%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("ODD: "+odd);
		System.out.println("EVEN: "+even);
	}

}
