public class Copy {
	
	private String name, gender, subtile;
	
	private int age, rollNo, userId;
	
	public Copy (String name, String gender, int age, int rollNo) {
		
		this.name = name;
		
		this.gender = gender;
		
		this.age = age;
		
		this.rollNo = rollNo;
	}
	
	// Copying the value of first Constructor and
	// setting those value equal to the instance variable
	
	public Copy (Copy obj) {
		
		this.name = obj.name;
		
		this.gender = obj.gender;
		
		this.age = obj.age;
		
		this.rollNo = obj.rollNo;
	}
	
	
	public static void main (String[] args) {
		
		Copy obj1 = new Copy ("Manish", "male", 19, 07);
		
		// Using copy contractor  by passing first object
		// to 2nd object as parameter
		
		Copy obj2 = new Copy (obj1);
		
		System.out.println (obj2);
		
	}
	
	
	@Override
	public String toString () {
		return "Copy{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", subtile='" + subtile + '\'' +
				", age=" + age +
				", rollNo=" + rollNo +
				", userId=" + userId +
				'}';
	}
}
