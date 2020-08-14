package javaFundamentals;

import java.util.Scanner;

public class Age_and_Gender {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int age=in.nextInt();
		if(s.equals("Male"))
		{
			if(age>=1 && age<=58)
			{
				System.out.print("8.4%");
			}
			else if(age>=59 && age<=100)
			{
				System.out.print("10.5%");
			}
		}
		else if(s.equals("Female"))
		{
			if(age>=1 && age<=58)
			{
				System.out.print("8.2%");
			}
			else if(age>=59 && age<=100)
			{
				System.out.print("9.2%");
			}
		}

	}

}
