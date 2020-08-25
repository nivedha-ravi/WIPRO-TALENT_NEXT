package packages;
class Example2
{
	protected void m1() {
		System.out.println("m1 method of class Example2");
	}
}
class Example1 extends Example2 {
	public void m1() {
		System.out.println("m1 method of class Example1");
	}

	public static void main(String[] args) {
		Example1 x=new Example1();
		x.m1();

	}

}
