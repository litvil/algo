package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MissedElementInArrayTest {
  @Test
  @DisplayName("Run")
  void test1() {
    MissedElementInArray task = new MissedElementInArray();
    assertEquals(4, task.solution(new int[] {2, 3, 1, 5}));
    assertEquals(1, task.solution(new int[] {2, 3}));
    assertEquals(5, task.solution(new int[] {1, 4, 2, 3}));
    assertEquals(1, task.solution(new int[] {}));
  }
}