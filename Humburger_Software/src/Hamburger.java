public class Hamburger {
	private char type;
	private int price;
	private int price2;
	private int extraTopping;
	public static void burgerMenu(){
		System.out.println ("""
				Type A (Plain) --> Rs 100,
				Type B (Rounded) --> Rs 120,
				Type C (Capcicum) --> Rs 135,
				Type D (Onion) --> Rs 110,
				Every Extra Topping will charge by 20rs.
				"""
		);
	}
	public Hamburger(char type , int extraTopping){
		this.type = type;
		switch (type){
			case 'A' -> price+=100;	
			case 'B' -> price+=120;	
			case 'C' -> price+=135;	
			case 'D' -> price+=110;
			default -> System.out.println ("Please provide correct type");
		}
		if(extraTopping > 0 && extraTopping < 4){
			price2+=20*extraTopping;
		}
	}
	
	public void printBill(){
		System.out.println ("Burger price of type "+type+ " is : " + price);
		System.out.println ("Price for extra topping is : " + price2);
		System.out.println("The total price for burger is : " + (price+price2 ));
	}
	public int getBill(){
		return price+price2;
	}
	
	public static void main (String[] args) {
		Hamburger hamburger = new Hamburger ('C',2);
		hamburger.burgerMenu ();
		System.out.println (hamburger.getBill ());
		hamburger.printBill ();
		
	}
}
