package exception_handling;

/*Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. 
Loop through the array and obtain the sum and average of all the elements and display the result. 
Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args)throws ArithmeticException,NumberFormatException {
		try
		{		
			Scanner in=new Scanner(System.in);
			int[] array = new int[5];
			int sum = 0;
			double avg = 0;
			
				for (int i = 0; i < array.length; i++)
					array[i] = in.nextInt();
				for (int i = 0; i < array.length; i++)
					sum += array[i];
				avg = sum / array.length;
				System.out.println("sum: " + sum);
				System.out.println("avg: " + avg);
			}
			catch(Exception e){
				System.out.println(e);
			}
			
	}
	}


