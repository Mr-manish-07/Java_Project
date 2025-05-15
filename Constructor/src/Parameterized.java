public class Parameterized {
	
	private String name;
	
	private int age, year, price;
	
	//The constructor which accept parameter.
	
	public Parameterized (int age, int year, int price, String name) {
		this.age = age;
		
		this.year = year;
		
		this.price = price;
		
		System.out.println ("Parameterized constructor is called with 4 parameter");
	}
	
	public Parameterized (int age, int price) {
		
		this.age = age;
		
		this.price = price;
		
		System.out.println ("Parameterized constructor is called with 2 parmeter");
	}
	
	public static void main (String[] args) {
		
		Parameterized obj1 = new Parameterized (10, 2025, 30000, "manish");
		
		Parameterized obj2 = new Parameterized (19, 12000);
	}
	
}
