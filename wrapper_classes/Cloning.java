package wrapper_classes;

public class Cloning {

	public static void main(String[] args) {
		Cloning_Employee c1=new Cloning_Employee();
		Cloning_Employee c2;
		c1.empid=101;
		c1.empname="Nivi";
		c2=c1.employeeCopy();
		System.out.println("Empid:"+c1.empid+" EmpName:"+c1.empname);
		System.out.println("Empid:"+c2.empid+" EmpName:"+c2.empname);
		c1.empid=102;
		c1.empname="Swe";
		System.out.println("Empid:"+c1.empid+" EmpName:"+c1.empname);
		System.out.println("Empid:"+c2.empid+" EmpName:"+c2.empname);

	}

}
