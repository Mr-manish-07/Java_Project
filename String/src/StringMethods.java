public class StringMethods {
	public static void main (String[] args) {
		
		
		// " = " operator is only check memory location if they both is at same memory location return true
		// String.equals(String2) keyword checks content of string if same then return true else false
		
		String str = "Manish";
		String str4 = "manish";
		String str2 = new String ("Manish");
		String str3 = new String ("Manish");
		System.out.println (str==str4);
		System.out.println (str3.equals (str));
		String s = " ";
		System.out.println (s.equals (""));
		System.out.println (str.equalsIgnoreCase (str4));
		System.out.println (str.codePointAt (0));
		if(s!=null && s.length ()!=0)
			System.out.println ("String is not empty");
		else
			System.out.println ("! String is Empty");
		
	}
}
