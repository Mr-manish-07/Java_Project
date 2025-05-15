public class Car extends Vehicle{
	@Override
	public void drive () {
		super.drive ();
		System.out.println (getClass ().getName ()+" Can be repaired by repairer");
	}
}
