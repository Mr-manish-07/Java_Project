package practice.dsa.Array_ArrayList;

public class Array_1D_DS {
	int[] arr;

	Array_1D_DS(int size){
		arr = new int[size];
		for (int i = 0 ; i<arr.length; i++){
			arr[i] = Integer.MIN_VALUE;
		}
	}


// INSERTION OF VALUE IN ARRAY

	public void insertion(int value , int index) {
		if (index >= 0 && index < arr.length) {
			if (arr[index] == Integer.MIN_VALUE){
				arr[index] = value;
			}else {
				System.out.println ("Value can be overwrite");
			}
			
		}else{
		System.out.println ("Array index out of bound");
		}
	}
	
	// Accessing value
	
	public int accessValue (int index ){
		return  arr[index];
	}
	
	// Searching value
	public void searchValue (int value ){
		int count = -1;
		for (int i =0 ; i<arr.length;i++){
			if (value == arr[i]){
				count = i;
			}
		}
		if (count == -1){
			System.out.println ("Value not found");
		}else {
			System.out.println ("Value found at index " + count);
		}
		
	}
	
	//Delete Array Element
	public void deleteElement(int index){
		arr[index] = Integer.MIN_VALUE;
	}
	
	//Traverse Array
	public  void traverseArr(){
		for (int i = 0; i < arr.length; i++) {
			System.out.println (arr[i]);
		}
	}
}

