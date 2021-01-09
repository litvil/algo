package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TwoArraysTest {
  @Test
  @DisplayName("Run")
  public void test1() {
    final TwoArrays twoArrays = new TwoArrays(
        new int[] {1, 2, 33, 87, 41, 5, 99},
        new int[] {4, 45, 33, 1, 41, 2}
    );

    assertEquals(List.of(1, 2, 33, 41), twoArrays.getCommonElements());
    assertEquals(List.of(1, 2, 33, 41), twoArrays.getCommonElementsJava());
  }
}