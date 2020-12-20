package com.litvil.algo.sorting;

// Time complexity of above implementation of shellsort is O(n2).
// In the above implementation gap is reduce by half in every iteration.
// There are many other ways to reduce gap which lead to better time complexity.
// See this for more details.
public class ShellSort {

  public static int[] sort(int[] input) {

    int n = input.length;

    // Start with a big gap, then reduce the gap
    for (int gap = n/2; gap > 0; gap /= 2)
    {
      // Do a gapped insertion sort for this gap size.
      // The first gap elements a[0..gap-1] are already
      // in gapped order keep adding one more element
      // until the entire array is gap sorted
      for (int i = gap; i < n; i += 1)
      {
        // add a[i] to the elements that have been gap
        // sorted save a[i] in temp and make a hole at
        // position i
        int temp = input[i];

        // shift earlier gap-sorted elements up until
        // the correct location for a[i] is found
        int j;
        for (j = i; j >= gap && input[j - gap] > temp; j -= gap)
          input[j] = input[j - gap];

        // put temp (the original a[i]) in its correct
        // location
        input[j] = temp;
      }
    }

    return input;
  }

  private static void swapElements(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }
}
