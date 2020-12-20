package com.litvil.algo.sorting;

// Average & Worst Time: O(n2) | Space: O(1)
public class SelectionSort {

  public static int[] sort(int[] input) {

    int size = input.length;

    // One by one move boundary of unsorted subarray
    for (int i = 0; i < size - 1; i++) {
      // Find the minimum element in unsorted array
      int minIdx = i;
      for (int j = i + 1; j < size; j++) {
        if (input[j] < input[minIdx]) {
          minIdx = j;
        }
      }

      // Swap the found minimum element with the first element
      swapElements(input, minIdx, i);
    }

    return input;
  }

  private static void swapElements(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }
}
