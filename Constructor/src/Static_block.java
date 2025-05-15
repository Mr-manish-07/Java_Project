public class Static_block {
	static String name;
	
	static int salary;
	
	static {
		
		name = "Manish Prajajpati";
		
		System.out.println ("Static block");
		
	}

	{
		System.out.println ("Instance block");
	}
	
	public static void main (String[] args) {
		
		Static_block obj1 = new Static_block ();
		
		System.out.println ("Name from static is " + Static_block.name);
		
	}
	
}
