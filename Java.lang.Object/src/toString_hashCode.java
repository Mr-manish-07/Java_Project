class toStr{
	int age;
	int rollNo;
	public toStr(int age){
		this.age = age;
	}
	
	@Override
	public String toString () {
		return "toStr : { 'age is :  " + age + " ' }";
	}
	
	@Override
	public int hashCode() {
		
		return rollNo;
	}
	
}

public class toString_hashCode {
	public static void main (String[] args) {
		toStr toStr = new toStr (14);
		toStr = null;
		
		toStr toStr1 = new toStr (45);
		System.out.println (toStr.toString ());
		System.out.println (toStr.hashCode ());
		System.out.println (toStr.equals (toStr1));
		
	}
}

