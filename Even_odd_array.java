package javaFundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_odd_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(a[i]%2==0)
			{
				arr.add(a[i]);
				System.out.print(a[i]+" ");
			}
			
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				arr.add(a[i]);
				System.out.print(a[i]+" ");
			}
		}
	}

}
