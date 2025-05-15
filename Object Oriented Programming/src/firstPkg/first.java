package firstPkg;

import javax.xml.crypto.Data;

public class first {
	static void one(){
		System.out.println ("This first");
	}
	
	public static void main (String[] args) {
		
//		first first = new first ();
//		two two = new two ();
		two.one ();
		first.one ();		
	}
	
}
class two extends first {
	static void one(){
		
	}
}