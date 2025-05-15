import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		int [] arr = new int[]{3,55,3,5};
		varArgs("Manish",arr);
	}
	public static   void varArgs(String name,int... array){
		for (int i =0; i<array.length; i++){
			System.out.println (array[i]/5);
		}
		System.out.println (Arrays.toString(array));
		System.out.println(name);
	} 
}