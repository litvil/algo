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
class CountingSortTest {
  @BeforeAll
  public void setup() {
  }

  @BeforeEach
  public void setupEach() {
  }

  @Test
  @DisplayName("Sorts")
  public void test1() {
    char arr[] = { 'g', 'e', 'e', 'k', 'z', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };

    CountingSort.sort(arr);
    assertArrayEquals(new char[] {'e','e','e','e','f','g','g','k','k','o','r','s','s', 'z'}, arr);
  }

}