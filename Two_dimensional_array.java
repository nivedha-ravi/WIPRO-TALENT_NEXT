package javaFundamentals;

import java.util.Scanner;

public class Two_dimensional_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(n<4) {
			System.out.println("Please enter 4 integers");
		}else {
			System.out.println("The given array is :");
			for(i=0;i<n;i+=2) {
				for(int j=i;j<i+2;j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
			System.out.println("The reversed array is :");
			for(i=n-1;i>=0;i-=2) {
				for(int j=i;j>i-2;j--) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
