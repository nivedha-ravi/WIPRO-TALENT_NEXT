package javaFundamentals;

import java.util.Scanner;

public class Non_repeating_elements {

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
			int count=0;
			if(a[i]!=-1)
			{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			if(count==0)
			{
				System.out.print(a[i]+" ");
			}
			}
		}

	}

}
