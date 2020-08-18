package javaFundamentals;

import java.util.Scanner;

public class Marks_of_students {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[101];
		for(int i=0;i<n;i++)
		{
			int num=in.nextInt();
			a[num]++;
		}
		for(int i=0;i<101;i++)
		{
			System.out.println(i+" "+a[i]);
		}
		//Percentage
		int k=0,sum=0;
		for(int i=0;i<101;i++)
		{
			if(i%10==0 && i!=0)
			{
				sum+=a[i];
				System.out.format("%d to %d - %d\n",k,i,sum);
				sum=0;
				k=i+1;
			}
			else
			{
				sum+=a[i];
				
			}
		}
	}

}
