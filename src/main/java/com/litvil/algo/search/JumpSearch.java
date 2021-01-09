package com.litvil.algo.search;

public class JumpSearch {
  public static int jumpSearch(int[] input, int x) {
    int n = input.length;

    // Finding block size to be jumped
    int step = (int) Math.floor(Math.sqrt(n));

    // Finding the block where element is present (if it is present)
    int prev = 0;
    while (input[Math.min(step, n) - 1] < x) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(n));
      if (prev >= n) {
        return -1;
      }
    }

    // Doing a linear search for x in block
    // beginning with prev.
    while (input[prev] < x) {
      prev++;

      // If we reached next block or end of
      // array, element is not present.
      if (prev == Math.min(step, n)) {
        return -1;
      }
    }

    // If element is found
    if (input[prev] == x) {
      return prev;
    }

    return -1;
  }
}
