package oops_and_Inheritance;

public class Shape {

	void draw()
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
	
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}

	


