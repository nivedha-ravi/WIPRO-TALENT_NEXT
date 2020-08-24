
public class Final {
	final double pi;
	public Final()
	{
		pi=3.14;
	}
	public Final(double pi)
	{
		this.pi=pi;
	}
	public static void main(String[] args) {
		Final f=new Final(22/7);
		System.out.println(f.pi);

	}

}
