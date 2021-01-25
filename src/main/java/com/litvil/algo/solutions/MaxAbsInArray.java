package com.litvil.algo.solutions;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import org.junit.Test;

/**
 * Task 1
 */
public class MaxAbsInArray {


  public int solution(int[] input) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int maxAbs = 0;
    for (int i = 0; i < input.length; i++) {
      int current = input[i];
      putIntMap(hashMap, current);
      final int abs = Math.abs(current);
      if (hasAbsInMap(hashMap, current) && abs > maxAbs) {
        maxAbs = abs;
      }
    }
    return maxAbs;
  }

  private boolean hasAbsInMap(HashMap<Integer, Integer> hashMap, int value) {
    final int opposite = -1 * value;
    return hashMap.containsKey(value) && hashMap.containsKey(opposite);
  }

  private void putIntMap(HashMap<Integer, Integer> hashMap, int value) {
    if (!hashMap.containsKey(value)) {
      hashMap.put(value, 1);
    }
  }

  @Test
  public void test() {
    assertEquals(
        3,
        new MaxAbsInArray().solution(new int[] {3, 2, -2, 5, -3})
    );
    assertEquals(
        0,
        new MaxAbsInArray().solution(new int[] {1, 2, 3, -4})
    );
    assertEquals(
        1,
        new MaxAbsInArray().solution(new int[] {1, 1, 2, -1, 2, -1})
    );
    assertEquals(
        1,
        new MaxAbsInArray().solution(new int[] {1, 1, 2, -1, 2, -122222})
    );
    assertEquals(
        66,
        new MaxAbsInArray().solution(new int[] {1, 1, -66, 2, -4, 2, -5, 7, 33, -7, 66, 122, -10, 10})
    );
    assertEquals(
        0,
        new MaxAbsInArray().solution(new int[] {})
    );
    assertEquals(
        0,
        new MaxAbsInArray().solution(new int[] {1, 1, -65, 2, -4, 2, -5, 7, 33, -74, 66, 22, 122, 122, -11, 10})
    );
  }
}
