// NEED TO PRINT THE WHOLE ELEMENTS EXCEPT FIRST AND LAST ELEMENT OF ARRAY

import java.util.Arrays;
import java.math.MutableBigInteger;

public class MiddleArray {
	public static void main (String[] args) {
		int[] array = {2, 565, 45, 89, 474, 454, 5, 556, 4};
		System.out.println (Arrays.toString (findMiddleArray (array)));
	}
	
	public static int[] findMiddleArray (int[] array) {
		if (array.length == 2) {
			return new int[0];
		}
		int[] middleArray = new int[array.length - 2];
		int index = 1;
		while (index < array.length - 1) {
			middleArray[index - 1] = array[index];
			index++;
		}
		return middleArray;
		
	}
	
}
