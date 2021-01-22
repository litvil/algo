package com.litvil.algo.solutions;

import java.util.HashMap;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 *
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 *
 */
public class MissedElementInArray {
  public int solution(int[] A) {
    HashMap<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < A.length; i++) {
      if (occurrencesMap.containsKey(A[i])) {
        int occurrences = occurrencesMap.get(A[i]);
        occurrences++;
        occurrencesMap.put(A[i], occurrences); //increment occurrence counter and store it
      } else {
        occurrencesMap.put(A[i], 1); //1st occurrences of this value
      }
    }
    for (int i = 1; i <= A.length+1; i++) {
      if (!occurrencesMap.containsKey(i)) {
        return i;
      }
    }
    return 0;
  }
}
