package com.litvil.algo.search;

import static org.junit.jupiter.api.Assertions.*;

import com.litvil.algo.sorting.BinaryInsertionSort;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
class LinearSearchTest {
  @Test
  @DisplayName("Search linear")
  public void test1() {
    final int index = LinearSearch.search(new int[] {3, 55, 72, 1, 4}, 72);
    assertEquals(2, index);
  }

  @Test
  @DisplayName("Search linear failed")
  public void test2() {
    final int index = LinearSearch.search(new int[] {3, 55, 72, 1, 4}, 54);
    assertEquals(-1, index);
  }
}