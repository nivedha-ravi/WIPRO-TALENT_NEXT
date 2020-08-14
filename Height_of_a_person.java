package javaFundamentals;

import java.util.Scanner;

public class Height_of_a_person {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int height=in.nextInt();
		if(height<150)
		{
			System.out.print("Dwarf");
		}
		else if(height>=150 && height<165)
		{
			System.out.print("Average");
		}
		else if(height>=165 && height<195)
		{
			System.out.print("Tall");
		}
		else
		{
			System.out.print("Abnormal");
		}

	}

}
