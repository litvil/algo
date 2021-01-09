package com.litvil.algo.search;

import java.util.Arrays;

public class ExponentialSearch {
  // Returns position of first occurrence of x in array
  static int exponentialSearch(int arr[], int n, int x) {
    // If x is present at firt location itself
    if (arr[0] == x) {
      return 0;
    }

    //  Find range for binary search byrepeated doubling
    int i = 1;
    while (i < n && arr[i] <= x) {
      i = i * 2;
    }

    // Call binary search for the found range.
    return Arrays.binarySearch(arr, i / 2, Math.min(i, n - 1), x);
  }

  public static int search(int arr[], int x) {
    return exponentialSearch(arr, arr.length, x);
  }
}
