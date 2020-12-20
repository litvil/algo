package com.litvil.algo.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NonDecreasingArrayTest {

  @Test
  @DisplayName("NonDecreasingArrayTest")
  public void test1() {
    assertFalse(
        NonDecreasingArray.checkPossibility(new int[] {3, 55, 72, 1, 4})
    );

    assertFalse(
        NonDecreasingArray.checkPossibility(new int[] {3,4,2,3})
    );

    assertTrue(
        NonDecreasingArray.checkPossibility(new int[] {-1,4,2,3})
    );
  }

}