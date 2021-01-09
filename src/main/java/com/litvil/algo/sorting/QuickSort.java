package com.litvil.algo.sorting;

public class QuickSort {

  // This function takes last element as pivot, places the pivot element at its correct position in sorted array,
  // and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot
  // Complexity: O(n2)
  // Average Time: O(n log n), Worst Time: O(n2) | Space: O(n log n)
  static int partition(int input[], int low, int high) {
    int pivot = input[high];
    int i = (low - 1); // index of smaller element
    for (int j = low; j < high; j++) {
      // If current element is smaller than the pivot
      if (input[j] < pivot) {
        i++;

        // swap input[i] and input[j]
        swapElements(input, i, j);
      }
    }

    // swap input[i+1] and input[high] (or pivot)
    swapElements(input, i + 1, high);

    return i + 1;
  }

  private static void swapElements(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }

  public static int[] sort(int[] input) {

    quicksort(input, 0, input.length - 1);

    return input;
  }

  static private void quicksort(int[] array, int first, int last) {
    if (first < last) {
      int pivot = partition(array, first, last);

      // Recursive call
      quicksort(array, first, pivot - 1);
      quicksort(array, pivot + 1, last);
    }
  }
}
