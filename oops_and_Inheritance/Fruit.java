package oops_and_Inheritance;

public class Fruit {
	String name;
	String taste;
	int size;
	void eat()
	{
		System.out.println("Eating fruits");
		
	}


}
class Apple extends Fruit
{
	Apple() {
		name = "Apple";
		taste = "sweet and caramelized";
	}
	void eat()
	{
		System.out.println("Name "+name);
		System.out.println("Taste "+taste);
	}
}
class Orange extends Fruit
{
	Orange() {
		name = "Orange";
		taste = "sweet-tert";
	}
	
	void eat()
	{
		System.out.println("Name "+name);
		System.out.println("Taste "+taste);
	}
}