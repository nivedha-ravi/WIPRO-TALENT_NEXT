package javaFundamentals;

import java.util.Scanner;

public class Employee_information {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int empid[]= {1001,1002,1003,1004,1005,1006,1007};
		String empname[]= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String joining_date[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
        "12/06/2006" };
		char desig_code[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String dept[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		int basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int it[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		int da[]= {20000,32000,12000,15000,40000};
		String designation[]= {"Engineer","Consultant","Clerk","Receptionist","Manager","Engineer","Consultant"};
		int salary[]=new int[7];
		for(int i=0;i<7;i++)
		{
			switch(desig_code[i])
			{
			case 'e':
				salary[i]=basic[i]+hra[i]-it[i]+da[0];
				break;
			case 'c':
				salary[i]=basic[i]+hra[i]-it[i]+da[1];
				break;
			case 'k':
				salary[i]=basic[i]+hra[i]-it[i]+da[2];
				break;
			case 'r':
				salary[i]=basic[i]+hra[i]-it[i]+da[3];
				break;
			case 'm':
				salary[i]=basic[i]+hra[i]-it[i]+da[4];
				break;
				
			}
		}
			int empno=in.nextInt();
			for(int i=0;i<7;i++)
			{
				if(empno==empid[i])
				{
					System.out.format("Employee id: %d Employee name: %s Department: %s Designation: %s Salary: %d ",empid[i],empname[i],dept[i],designation[i],salary[i]);
					return;
				}
			}
		System.out.print("Employee id "+empno+" not found");

	}

}
