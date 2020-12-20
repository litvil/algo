package com.litvil.algo.sorting;

// Average & Worst Time: O(n2) | Space: O(1)
// Bubble sort is also very simple. It iterates through the array and compares each element with the item after it
// and swaps them accordingly based on their value. It will take O(n2) passes over the input data structure
// to get it entirely sorted.
public class BubbleSort {

  public static int[] sort(int[] input) {

    bubblesort(input);

    return input;
  }

  static void bubblesort(int[] input) {
    int size = input.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (input[j] > input[j + 1]) {
          // swap input[j+1] and input[j]
          swapElements(input, j, j + 1);
        }
      }
    }
  }

  private static void swapElements(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }
}
