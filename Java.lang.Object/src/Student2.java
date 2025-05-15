class Student1 {
	
	int roll;
	
	
	
	
	@Override
	
	public boolean equals(Object o) {
		
		if (o instanceof Student) {
			
			return this.roll == ((Student1) o).roll;
			
			
		}
		
		return false;
		
		
	}
	
	
}




public class Student2 {
	
	public static void main (String[] args) {
		Student1 student1 = new Student1 ();
		
	}
	
}
