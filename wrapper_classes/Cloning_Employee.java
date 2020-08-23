package wrapper_classes;

public class Cloning_Employee implements Cloneable{
	int empid;
	String empname;
	Cloning_Employee employeeCopy()
	{
		try
		{
			return (Cloning_Employee) super.clone();
		}
		catch(CloneNotSupportedException c)
		{
			System.out.println("Cloning not possible");
			return this;
		}
	}


	

}
