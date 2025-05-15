public class BubbleSort {
	void bubbleSort(int[] arr){
		int sizeArr = arr.length;
		for (int i = 0; i < sizeArr; i++) {
			for (int j = 0; j < sizeArr - i -1 ; j++) {
				if (arr[j] > arr[j+1] ){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
