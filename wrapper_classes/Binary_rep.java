package wrapper_classes;

import java.util.Scanner;

public class Binary_rep {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer(1-255)");
		int x=in.nextInt();
		String output = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
		System.out.println(output);	
	}

}
