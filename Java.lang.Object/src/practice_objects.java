import java.util.Scanner;

public class practice_objects {
	private  int age;
	private String name;
	private boolean isTrue;
	public  practice_objects (int age,String name,boolean isTrue){
		this.age=age;
		this.isTrue=isTrue;
		this.name=name;
	}
	
	
//	@Override
//	String toString () {
//		return "To string is being called for practice class";
//	}
	
	public static void main (String[] args) {
		practice_objects practiceObjects  = new practice_objects (18,"Manish",true);
//		Object tostr=practiceObjects.toString ();
		String  hash = Integer.toHexString(practiceObjects.hashCode());
//		System.out.println (tostr);
		System.out.println (Integer.parseInt (hash,16));
		String str = new String ("maish");
		System.out.println (str);
		int i = 3;
		int int2 = new int (3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
