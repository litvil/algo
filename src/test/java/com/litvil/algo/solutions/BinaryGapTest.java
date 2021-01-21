package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinaryGapTest {
  @Test
  @DisplayName("Run")
  public void test1() {

    assertEquals(5, BinaryGap.solution(1041));
    assertEquals(4, BinaryGap.solution(529));
    assertEquals(1, BinaryGap.solution(20));
    assertEquals(0, BinaryGap.solution(15));

  }
}