package practice.dsa.Array_ArrayList;

public class Array_2D_DS {
	int[][] twoDimArray;
	
	public boolean valueChecker(int row,int col){
		return row >= 0 && col >= 0;
	}
	
	public Array_2D_DS(int row, int column){
		if (valueChecker (row,column)){
			twoDimArray = new int[row][column];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					twoDimArray[i][j]=Integer.MIN_VALUE;
				}
			}
		}
		
	} 
	
	// Insertion of element
	public void insertEle(int row,int column, int value){
		try {
			if(valueChecker (row,column)){
				twoDimArray[row][column]=value;
			}
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("You can Enter size of array more than its length");
		}
		
	}
	
	//Accessing value
	public void accessValue(int row,int col){
		if(valueChecker(row,col)){
			System.out.println ("Your value of index ["+row+""+col+"] = "+ twoDimArray[row][col]);
		}
	}
	
	//Searching element 
	public String searchEle (int value){
		String rowCol ="Not found";
		int i , j;
		for ( i = 0; i < twoDimArray.length; i++) {
			for ( j = 0; j <twoDimArray[i].length; j++) {
				if(value==twoDimArray[i][j]){
					return  " Row "+i+" ,column"+j;
				}
			}
		}
		return rowCol;
	}
	
	// Traverse Array 
	public  void traverseArray (){
		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j < twoDimArray[i].length; j++) {
				System.out.println (twoDimArray[i][j]);
				
			}
			
		}
	}
	public  void deleteArray(int row,int col){
		twoDimArray[row][col] = Integer.MIN_VALUE; 
	}
	
	



}
