import java.util.Random;

public class randomValue extends Random {
	
	public randomValue (long seed) {
		super (seed);
	}
	
	public randomValue () {
	}
	
	public static void main (String[] args) {
		Random random = new Random ();
		int i =0;
		while ( i!= random.nextInt(1000)){
			int value=random.nextInt (10);
			System.out.println (value);
			i++;
		}
	}
}
