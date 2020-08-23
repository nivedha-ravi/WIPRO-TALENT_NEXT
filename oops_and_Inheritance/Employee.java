package oops_and_Inheritance;

public class Employee extends Person {
	Employee(String name) {
		super(name);
	}
	private double Annual_Salary;
	private int Started_year;
	private String insurance_no;

	public void setAnnualSalary(double Annual_Salary) {
		this.Annual_Salary=Annual_Salary;
		
	}
	public void setStartedYear(int Started_year) {
		this.Started_year=Started_year;
		
	}
	public void setInsuranceNo(String insurance_no) {
		this.insurance_no=insurance_no;
		
	}
	public double getAnnualSalary() {
		return Annual_Salary;
		
	}
	public int getStartedYEar() {
		return Started_year;
		
	}
	public String getInsuranceNo() {
		return insurance_no;
	}
}
	