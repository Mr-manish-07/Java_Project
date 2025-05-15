public class Rectangle extends Shape{
	int length,breadth;
	public Rectangle (int length,int breadth){
		this.breadth=breadth;
		this.length=length;
	}
	@Override
	public int getArea () {
		return length*breadth;
	}
}
