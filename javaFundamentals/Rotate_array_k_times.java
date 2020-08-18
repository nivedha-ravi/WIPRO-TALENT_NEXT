package javaFundamentals;

import java.util.Scanner;

public class Rotate_array_k_times {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int k=in.nextInt();
		int count=1;
		while(count<=k)//left rotate
		{
			int temp=a[0];
			for(int i=0;i<n-1;i++)
			{
			
				a[i]=a[i+1];
	
			}
			a[n-1]=temp;
			count++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		count=1;
		while(count<=k)//right rotate
		{
			int temp=a[n-1];
			for(int i=n-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
			count++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
