package com.litvil.algo.sorting;

// Average & Worst Time: O(n log n) | Space: O(n log n)
public class MergeSort {

  public static int[] sort(int[] input) {

    mergesort(input, 0, input.length - 1);

    return input;
  }

  /**
   * A Java method to implement MergeSort algorithm using recursion
   *
   * @param input integer array to be sorted
   * @param startIdx index of first element in array
   * @param endIdx   index of last element in array
   */
  private static void mergesort(int[] input, int startIdx, int endIdx) {

    if (startIdx < endIdx) {
      // Find the middle point
      int middleIdx = (startIdx + endIdx) / 2;

      // Sort first and second halves
      mergesort(input, startIdx, middleIdx);
      mergesort(input, middleIdx + 1, endIdx);

      // Merge the sorted halves
      merge(input, startIdx, middleIdx, endIdx);
    }
  }

  // Merges two subarrays of input[].
  // First subarray is input[startIdx..middleIdx]
  // Second subarray is input[middleIdx+1..endIdx]
  static void merge(int[] input, int startIdx, int middleIdx, int endIdx) {
    // Find sizes of two subarrays to be merged
    int leftSize = middleIdx - startIdx + 1;
    int rightSize = endIdx - middleIdx;

    /* Create temp arrays */
    int L[] = new int[leftSize];
    int R[] = new int[rightSize];

    /*Copy data to temp arrays*/
    for (int i = 0; i < leftSize; ++i) {
      L[i] = input[startIdx + i];
    }

    for (int j = 0; j < rightSize; ++j) {
      R[j] = input[middleIdx + 1 + j];
    }

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    int i = 0;
    int j = 0;

    // Initial index of merged subarry array
    int k = startIdx;

    while (i < leftSize && j < rightSize) {
      if (L[i] <= R[j]) {
        input[k] = L[i];
        i++;
      } else {
        input[k] = R[j];
        j++;
      }
      k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < leftSize) {
      input[k] = L[i];
      i++;
      k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < rightSize) {
      input[k] = R[j];
      j++;
      k++;
    }
  }
}
