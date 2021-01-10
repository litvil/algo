package com.litvil.algo.solutions;

import java.util.ArrayList;

/**
 * Given an unsorted array A of size N that contains only non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 *
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1#
 *
 * Example 1:
 *
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 10, S = 15
 * A[] = {1,2,3,4,5,6,7,8,9,10}
 * Output: 1 5
 * Explanation: The sum of elements
 * from 1st position to 5th position
 * is 15.
 *
 */
public class SubarrayWithGivenSum {
  static ArrayList<Integer> subarraySum(int n, int s, int[] m) {

    int sum;

    ArrayList<Integer> out = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      sum = m[i];
      if (sum == s) {
        out.add(i + 1);
        out.add(i + 1);
        return out;
      } else {
        for (int j = i + 1; j < n; j++) {
          sum += m[j];
          if (sum > s) {
            break;
          }
          if (sum == s) {
            out.add(i + 1);
            out.add(j + 1);
            return out;
          }
        }
      }
    }
    out.add(-1);
    return out;

  }
}
