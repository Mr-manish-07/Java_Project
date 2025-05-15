import java.util.Arrays;


class Main{
	public static void main(String args[]){
		
		int arr[]={90,89,87,67,66,65,45,44,34,23,12,9,7};
		
		// BUBBLE SORT ALGORITHM 
//		BubbleSort bs = new BubbleSort ();
//		bs.bubbleSort (arr);
//		System.out.println (Arrays.toString (arr));
		
		//SELECTION SORT ALGORITHM
//		SelectionSort ss = new SelectionSort ();
//		ss.selectionSort (arr);
//		System.out.println (Arrays.toString (arr));
		
		//INSERTION SORT ALGORITHM
		InsertionSort i = new InsertionSort ();
		i.insertionSort (arr);
		System.out.println (Arrays.toString (arr));
		
		
		//System.out.println (Arrays.toString (arr));
		//System.out.println (Arrays.toString (arr));
		//System.out.println (Arrays.toString (arr));
		//System.out.println (Arrays.toString (arr));
		
	}
}