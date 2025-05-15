public class Str_StrBuffer {
	public static void main (String[] args) {
		
		String str = "Manish"+ "Kumar";
		str.concat ("good bye");
		StringBuffer str2 = new StringBuffer ("Manish"+"Kumar" );
		str2.append ("goodbye");
		System.out.println (str.length ());
		System.out.println (str2.length ());
	}
	
	
	
}
