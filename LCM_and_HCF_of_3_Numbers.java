package javaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class LCM_and_HCF_of_3_Numbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<3;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int a=arr[0];
		int b=arr[1];
		int c=arr[2];
		int gcd1=findHcf(a, b);
		int gcd2=findHcf(gcd1, c);
		int lcm1=findLCM(b,c);
		int lcm2=findLCM(lcm1,a);
		
		System.out.println("HCF: "+gcd2);
		System.out.println("LCM: "+lcm2);

	}

	public static int findLCM(int b, int c) {
		return b*c/findHcf(b,c);
	}

	public static int findHcf(int a, int b) {
		if(b==0)
		{
			return a;
		}
		return findHcf(b, a%b);
	}

}
