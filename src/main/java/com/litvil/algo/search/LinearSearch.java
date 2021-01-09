package com.litvil.algo.search;

// Time Complexity: O(n)
public class LinearSearch {

  public static int search(int[] input, int x) {
    int n = input.length;
    for (int i = 0; i < n; i++)
    {
      if (input[i] == x)
        return i;
    }
    return -1;
  }
}
