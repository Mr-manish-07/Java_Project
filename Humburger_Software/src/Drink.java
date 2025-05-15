public class Drink {
	private char type;
	private int size;
	private int price1;
	private int price2;
	
	public static void  drinkMenu(){
		System.out.println ("""
				Type A Beer --> Rs 250,
				Type B Wine --> Rs 460,
				Type C SoftDrink --> Rs 120,
				Size can be max 4, Every size will increase Price by 20% 
				""");
	}
	public  Drink(char type, int size){
		this.type = type ;
		this.size = size;
		switch (type){
			case 'A' -> price1+=250;
			case 'B' -> price1 += 460;
			case 'C' -> price1+=120;
			default -> price1+=0;
		}
		if(size>0 && size < 5 ){
			int percentage = price1*20/100;
			price2 += percentage;
		}
	}
	public void printBill(){
			System.out.println ("Burger price of type "+type+ " is : " + price1);
			System.out.println ("Price for size "+size+" : " + price2);
			System.out.println("The total price for drink is : " + (price1+price2 ));
		
	}
	
	public  int getBill(){
		return price1+price2;
	}
	
	public static void main (String[] args) {
		Drink drink = new Drink ('B',4);
		drink.getBill ();
		drink.printBill ();
	}
	
}
