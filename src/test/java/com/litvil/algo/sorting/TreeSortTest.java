package com.litvil.algo.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
class TreeSortTest {
  @Test
  @DisplayName("Sorts")
  public void test1() {
    int[] input = {3, 55, 72, 1, 4};
    final List<Integer> sorted = TreeSort.sort(input);
    System.out.println(sorted.toString());

    assertEquals(List.of(1, 3, 4, 55, 72), sorted);
  }
}