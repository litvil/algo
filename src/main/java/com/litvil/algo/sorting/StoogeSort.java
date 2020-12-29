package com.litvil.algo.sorting;

// The running time complexity of stooge sort can be written as,
//
// T(n) = 3T(3n/2) + ?(1)
//
// Solution of above recurrence is O(n(log3/log1.5)) = O(n2.709), hence it is slower than even bubble sort(n^2).
public class StoogeSort {

  static void stoogesort(int arr[], int l, int h) {
    if (l >= h) {
      return;
    }

    // If first element is smaller than last, swap them
    if (arr[l] > arr[h]) {
      swapElements(arr, l, h);
    }

    // If there are more than 2 elements in the array
    if (h - l + 1 > 2) {
      int t = (h - l + 1) / 3;

      // Recursively sort first 2/3 elements
      stoogesort(arr, l, h - t);

      // Recursively sort last 2/3 elements
      stoogesort(arr, l + t, h);

      // Recursively sort first 2/3 elements
      // again to confirm
      stoogesort(arr, l, h - t);
    }
  }

  private static void swapElements(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }

  public static int[] sort(int[] input) {
    int n = input.length;
    stoogesort(input, 0, n - 1);
    return input;
  }
}
