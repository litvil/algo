package com.litvil.algo.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
class BinaryInsertionSortTest {
  @BeforeAll
  public void setup() {
  }

  @BeforeEach
  public void setupEach() {
  }

  @Test
  @DisplayName("Sorts")
  public void test1() {
    final int[] sorted = BinaryInsertionSort.sort(new int[] {3, 55, 72, 1, 4});
    assertArrayEquals(new int[] {1, 3, 4, 55, 72}, sorted);
  }

}