package oops_and_Inheritance;

public class Test_Employee {

	public static void main(String[] args) {
		Employee e=new Employee("Nivedha");
		System.out.println("Details of Employee: ");
		System.out.println("Name:"+e.getName());
		e.setAnnualSalary(1000000.222);
		System.out.println("Annual Salary:"+e.getAnnualSalary());
		e.setStartedYear(2001);
		System.out.println("Started Year:"+e.getStartedYEar());
		e.setInsuranceNo("12365478930");
		System.out.println("Insurance No:"+e.getInsuranceNo());

	}

}
