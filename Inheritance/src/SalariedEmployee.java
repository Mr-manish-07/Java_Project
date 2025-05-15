public class SalariedEmployee extends Employee{
	
	double annualSalary;
	boolean isreTired;
	
	public SalariedEmployee (String name, String dateOfBirth, String hireDate, boolean isreTired, double annualSalary) {
		super (name, dateOfBirth, hireDate);
		this.isreTired = isreTired;
		this.annualSalary = annualSalary;
	}
	
	
//	@Override
//	public String toString () {
//		return "SalariedEmployee{" +
//				"annualSalary=" + annualSalary +
//				", isreTired=" + isreTired +
//				"} " + super.toString ();
//	}
	
	@Override
	public double collectPay () {
		return (int) annualSalary/2;
	}
}

