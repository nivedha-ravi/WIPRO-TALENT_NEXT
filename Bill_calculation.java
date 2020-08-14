package javaFundamentals;

import java.util.Scanner;

public class Bill_calculation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		double bill=0.0;
		if(amount>=1 && amount<=50)
		{
			bill=amount*0.50;
		}
		else if(amount>=51 && amount<=150)
		{
			bill=amount*0.75;
		}
		else if(amount>=151 && amount<=250)
		{
			bill=amount*1.20;
		}
		else if(amount>250)
		{
			bill=amount*1.50;
		}
		System.out.print(bill+(bill*20)/100.0);
	}

}
