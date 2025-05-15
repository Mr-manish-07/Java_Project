public class Cheetah extends AnotherAnimal{
	String speed ;
	public Cheetah(String speed){
		this.speed =speed;
	}
	@Override
	public void move () {
		System.out.println ("Cheetah can run faster at the speed of "+ speed + " km/h");
	}
}
