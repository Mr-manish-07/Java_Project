public class Main {
	static {
		System.out.println ("Static block is called before main function as well as before object creation");
	}
	public Main(){
		System.out.println ("Constructor is called after the Instance block");
	}
	{
		System.out.println ("Instance block is executed when the object is created");
	}
	
	public static void main (String[] args) {
		
		Main main = new Main ();
	}
}
