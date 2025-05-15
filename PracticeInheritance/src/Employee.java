public class Employee {
	private double salary;
	public Employee (double salary){
		this.salary=salary;
	}
	
	public void work(){
		System.out.println ("The requied work will be overridden");
	}
	public  double getSalary(){
		return salary;
	}
	
	@Override
	public String toString () {
		return "Employee{" +
				"salary=" + salary +
				'}';
	}
}
