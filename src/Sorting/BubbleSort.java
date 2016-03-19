package Sorting;

public class BubbleSort {
  /**
   * bubbleSort sorts an array of integers using bubble sort
   * 
   * @param unsortedArray
   *          an unsorted array of integers
   * @return the input array, sorted least to greatest
   */
  public static int[] bubbleSort(int[] unsortedArray) {
    boolean all_swapped = false;
    while (!all_swapped) {
      all_swapped = true;
      for (int i = 1; i < unsortedArray.length; i++) {
        if (unsortedArray[i - 1] > unsortedArray[i]) {
          int temp = unsortedArray[i - 1];
          unsortedArray[i - 1] = unsortedArray[i];
          unsortedArray[i] = temp;
          all_swapped = false;
        }
      }
    }

    return unsortedArray;
  }
}
