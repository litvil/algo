package com.litvil.algo.solutions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.junit.Test;

/**
 * Given nums = [1,1,2], --> [1,2]
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 *
 * Example 2:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4], -> [0,1,2,3,4]
 */
public class RemoveDuplicates {
  // [0,0,1,1,2,2,2,3,4,4]
  // [0,1,2,3,4]
  public List<Integer> cleanSorted(int[] input) {
    List<Integer> out = new ArrayList<>();
    Integer last = null;
    for (int i = 0; i < input.length; i++) {
      int current = input[i];
      if (Objects.isNull(last) || current != last) {
        out.add(current);
        last = current;
      }
    }

    return out;
  }
  // [0,0,1,1,2,2,2,3,4,4]
  // [0,1,2,3,4]

  public ArrayList<Integer> cleanUnsorted(int[] input) {
    List<Integer> out = new ArrayList<>();
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    /**
     *
     * {
     *    0: 2
     *   "1": 2
     *   "2": 3
     *   "3": 1
     *   "4": 2
     * }
     */
    for (int i = 0; i < input.length; i++) {
      int current = input[i];

      if (hashMap.containsKey(current)) {
        Integer occurance = hashMap.get(current);
        occurance++;
        hashMap.put(current, occurance);
      } else {
        hashMap.put(current, 1);
      }
    }

    Set keySet = hashMap.keySet();

    return new ArrayList<>(keySet);
  }

  public List<Integer> clean(int[] input) {
    Arrays.sort(input);
    return cleanSorted(input);
  }

  @Test
  public void test6() {
    assertEquals(List.of(1, 2, 3, 4, 5), new RemoveDuplicates().clean(new int[] {1, 1, 2, 2, 2, 3, 1, 4, 4, 2, 5, 1}));
  }
}
