package com.litvil.algo.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.litvil.algo.sorting.MergeSort;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
class JumpSearchTest {
  @Test
  @DisplayName("Search")
  public void test1() {
    final int[] input = {3, 55, 72, 1, 4};
    MergeSort.sort(input);
    // 1,3,4,55,72
    final int index = JumpSearch.jumpSearch(input, 4);
    assertEquals(2, index);
  }

  @Test
  @DisplayName("Search failed")
  public void test2() {
    final int[] input = {3, 55, 72, 1, 4};
    MergeSort.sort(input);
    // 1,3,4,55,72
    final int index = JumpSearch.jumpSearch(input, 433);
    assertEquals(-1, index);
  }
}