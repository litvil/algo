package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CyclicRotationTest {
  @Test
  @DisplayName("Run")
  void test1() {
    CyclicRotation task = new CyclicRotation();
    assertArrayEquals(new int[] {9, 7, 6, 3, 8}, task.solution(new int[] {3, 8, 9, 7, 6}, 3));
    assertArrayEquals(new int[] {3, 8, 9, 7, 6}, task.solution(new int[] {3, 8, 9, 7, 6}, 5));
    assertArrayEquals(new int[] {0, 0, 0}, task.solution(new int[] {0, 0, 0}, 1));

  }
}