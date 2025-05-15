public class absClass {
	public static void main (String[] args) {
		
	}
}
abstract class Geeks {
	abstract void turnOn();
	abstract void turnOff();
	abstract void numOperation ();
}
abstract class newClass2 extends  Geeks {
	@Override
	void numOperation () {
		System.out.println ("PrintSomething");
		
	}
}
