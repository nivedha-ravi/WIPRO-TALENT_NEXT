package javaFundamentals;

import java.util.Scanner;

public class Sum_and_Prod_of_first_and_last_digit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int last=n%10,first;
		for(;n>10;n/=10);
		first=n;
		System.out.println("Sum:"+(first+last));
		System.out.println("Product:"+first*last);

	}

}
