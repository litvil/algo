package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SubarrayWithGivenSumTest {
  @Test
  @DisplayName("Run")
  public void test1() {
    final ArrayList<Integer> range = SubarrayWithGivenSum.subarraySum(5, 12,
        new int[] {1, 2, 3, 7, 5}
    );

    assertEquals(List.of(2,4), range);
  }
}