public  class Main {
	public static void main (String[] args) {
		Hamburger.burgerMenu ();
		Drink.drinkMenu ();
		Hamburger hamburger = new Hamburger ('C' , 3);
		Drink drink = new Drink ('B',4);
		hamburger.printBill ();
		drink.printBill ();
		int total = hamburger.getBill ()+ drink.getBill ();
		System.out.println ("Total bill for your order is "+total);
		
	}
}