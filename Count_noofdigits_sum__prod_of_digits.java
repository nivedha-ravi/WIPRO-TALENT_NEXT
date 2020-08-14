package javaFundamentals;

import java.util.Scanner;

public class Count_noofdigits_sum__prod_of_digits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0,prod=1,count=0;
		while(n>0)
		{
			count++;
			sum+=n%10;
			prod*=n%10;
			n/=10;
		}
		System.out.println("No of digits:"+count);
		System.out.println("Sum:"+sum);
		System.out.println("Product:"+prod);

	}

}
