package com.litvil.algo.sorting;

import java.util.Arrays;

// Time Complexity: The algorithm as a whole still has a running worst-case running time of O(n2)
// because of the series of swaps required for each insertion.
public class BinaryInsertionSort {


  public static int[] sort(int[] input) {
    for (int i = 1; i < input.length; i++)
    {
      int x = input[i];

      // Find location to insert
      // using binary search
      int j = Math.abs(Arrays.binarySearch(input, 0, i, x) + 1);

      // Shifting array to one location right
      System.arraycopy(input, j, input, j + 1, i - j);

      // Placing element at its correct location
      input[j] = x;
    }
    return input;
  }
}
