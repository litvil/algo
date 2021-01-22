package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OddOccurrencesInArrayTest {
  @Test
  @DisplayName("Run")
  void test1() {
    OddOccurrencesInArray task = new OddOccurrencesInArray();
    assertEquals(7, task.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
  }
}