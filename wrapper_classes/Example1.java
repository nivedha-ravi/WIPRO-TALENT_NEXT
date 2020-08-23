package wrapper_classes;

public class Example1 {

	public static void main(String[] args) {
		byte b=10;
		fun(b);

	}

	static void fun(int i) {
		
		System.out.println("int");
	}
	static void fun(Integer i) {
		
		System.out.println("integer");
	}
	
}
