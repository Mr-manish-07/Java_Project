public class Circle extends  AnotherShape{
	private double radius;
	public Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public void getArea () {
		System.out.println ("The area of circle is " + 3.14*(Math.pow (radius,2)));
	}
	
	@Override
	public void getPerimeter () {
		System.out.println ("The perimeter of circle is " + 2*3.14*radius);
	}
}
