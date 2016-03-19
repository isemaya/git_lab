package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		int temp;
      	for (int i = 1; i < array.length; i++) {
          	for(int j = i ; j > 0 ; j--){
              	if(array[j] < array[j-1]){
                	temp = array[j];
                  	array[j] = array[j-1];
                  	array[j-1] = temp;
              	}
          	}
      	}
     	return array;
	}
}
