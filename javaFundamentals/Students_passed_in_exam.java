package javaFundamentals;

import java.util.Scanner;

public class Students_passed_in_exam {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int noofStud=in.nextInt();
		int pass=0;
		while(noofStud>=1)
		{
			int marks=in.nextInt();
			if(marks>=35)
			{
				pass++;
			}
			noofStud--;
		}
		System.out.print("No of Passed Students: "+pass);

	}

}
