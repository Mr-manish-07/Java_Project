public class Main extends Object {
	public static void main (String[] args) {
		Student stu = new Student ("Manish",2311231);
		System.out.println (stu.toString ());
		
		PrimaryStudent stu1  = new PrimaryStudent ("Ranjeet",19,"Mitlesh");
		System.out.println (stu1);
		

	}
}

class Student  {
	private String name;
	private  int age;
	
	Student (String name,int age ){
		this.name = name;
		this.age=age;
	}
	
//	@Override
//	public String toString () {
//		return super.toString ();
//	}
	
	@Override
	public String toString () {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
class  PrimaryStudent extends Student{
	private String parentName;
	PrimaryStudent (String name, int roll, String parentName){
		super(name,roll);
		this.parentName=parentName;
		try {
		
		} catch (NumberFormatException e) {
			
		}
	}
}