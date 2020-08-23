package oops_and_Inheritance;

import java.util.Scanner;

public class Box {
	int width;
	int height;
	int depth;
	Box(int width,int height,int depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Box b=new Box(in.nextInt(),in.nextInt(),in.nextInt());
		System.out.format("Volume of a box: %dcm3 ",b.volume());
		
	}

	public int volume() {
		
		return width*height*depth;
	}

}
