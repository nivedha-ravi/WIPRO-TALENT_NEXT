package oops_and_Inheritance;

import oops_and_Inheritance.Shape.Circle;

public class Polymorphism_2 {

	public static void main(String[] args) {
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
	}

}
