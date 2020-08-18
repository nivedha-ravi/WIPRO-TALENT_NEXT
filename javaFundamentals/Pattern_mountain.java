package javaFundamentals;

public class Pattern_mountain {

	public static void main(String[] args) {
		int totalrow=5;
		int row,colspace,colnum;
		for(row=1;row<=totalrow;row++)
		{
			for(colspace=totalrow-row;colspace>=1;colspace--)
			{
				System.out.print(" ");
			}
			for(colnum=1;colnum<=row*2-1;colnum++)
			{
				System.out.print(colnum);
			}
			System.out.println();
		}
		for(row=totalrow-1;row>=1;row--)
		{
			for(colspace=1;colspace<=totalrow-row;colspace++)
			{
				System.out.print(" ");
			}
			for(colnum=1;colnum<=2*row-1;colnum++)
			{
				System.out.print(colnum);
			}
			System.out.println();
		}
	}

}
