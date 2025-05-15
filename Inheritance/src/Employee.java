public class Employee extends Worker {
	private long empolyeId;
	private String hireDate;
	public static int employeeNo = 1;
	
	public Employee (String name, String dateOfBirth, String hireDate) {
		super (name, dateOfBirth);
		this.empolyeId = Employee.employeeNo++;
		this.hireDate = hireDate;
	}
	
//	@Override
//	public String toString () {
//		return "Employee{" +
//				"empolyeId=" + empolyeId +
//				", hireDate='" + hireDate + '\'' +
//				"} " + super.toString ();
//	}
//	
	public static void main (String[] args) {
//		Employee emp = new Employee ("Manish","24/06/2005","10/10/2020");
//		System.out.println (emp);
//		Employee emp2 = new Employee ("Rahul","10/10/2000","20/02/2004");
//		System.out.println (emp2);
		SalariedEmployee emp3 = new SalariedEmployee ("Rahul","10/10/2000","20/02/2004",true,120);
		System.out.println (emp3.annualSalary);
		System.out.println (emp3.isreTired);
		System.out.println (emp3.collectPay ());
//		Employee emp4 = new Employee ("Rahul","10/10/2000","20/02/2004");
//		System.out.println (emp4);
	}
}
