package javaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest_element_of_an_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[n-2]);
	}

}
