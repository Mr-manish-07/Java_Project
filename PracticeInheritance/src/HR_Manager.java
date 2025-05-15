public class HR_Manager extends Employee{
	String name;
	int clinetId;
	int yearOfJoining;
	String department;
	boolean isNew;
	
	public HR_Manager (double salary, String name, int clinetId, int yearOfJoining, String department) {
		super (salary);
		this.name = name;
		this.clinetId = clinetId;
		this.yearOfJoining = yearOfJoining;
		this.department = department;
	}
	
	@Override
	public void work () {
		System.out.println ("Work will be done b/w 9:30 - 5:30 ");
	}
	public String addEmployee(){
		String newOrOld = yearOfJoining > 2022  && yearOfJoining < 2025 ? "New":"Old" ;
		return "There is a "+ newOrOld + " Employee, who is working since "+yearOfJoining+
				". The Name of the employe is " + name + " whose salary is "+ getSalary () + 
				" who is working in the deparment of " + department;
	}
	
	@Override
	public String toString () {
		return "HR_Manager{" +
				"name='" + name + '\'' +
				", clinetId=" + clinetId +
				", yearOfJoining=" + yearOfJoining +
				", department='" + department + '\'' +
				", isNew=" + isNew +
				"} " + super.toString ();
	}
}
