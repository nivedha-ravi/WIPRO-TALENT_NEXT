package javaFundamentals;

import java.util.Scanner;

public class Largest_of_two_dimensional_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(n<9) {
			System.out.println("Please enter 9 integers");
		}else {
			System.out.println("The given array is :");
			for(i=0;i<n;i+=3) {
				for(int j=i;j<i+3;j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is : ");
			int m=a[0];
			for(i=0;i<n;i++) {
				m=Math.max(a[i], m);
			}
			System.out.print(m);
		}
		sc.close();
	}

}
