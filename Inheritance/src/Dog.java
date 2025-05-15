public class Dog extends Animal {
	
	private String earShape;
	private String tailShape;
	
	public Dog (String type, double weight, String earShape, String tailShape) {
		super (type, weight < 15 ? "Small " : (weight < 35 ? "Medium" : "Large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}
	
	public Dog () {
		super ("Russian", "2.5feet", 7.2);
	}
	
	public Dog (String type, double weight) {
		this (type, weight, "roundEar", "curveTail");
	}
	
	
	@Override
	public String toString () {
		return "Dog{" +
				"earShape='" + earShape + '\'' +
				", tailShape='" + tailShape + '\'' +
				"} " + super.toString ();
	}
	
	public void makeNoise () {
	
	}
	
	@Override
	public void move (String speed) {
		super.move (speed);
//        System.out.println("This is move method inside dog class");
		if (speed == "slow") {
			bark ();
			run ();
		} else {
			walk ();
			wagTail ();
		}
	}
	
	private void bark () {
		System.out.print ("Barking");
	}
	
	private void run () {
		System.out.print ("dog running");
	}
	
	private void walk () {
		System.out.print ("dog walking");
	}
	
	private void wagTail () {
		System.out.print ("wagTail");
	}
}
