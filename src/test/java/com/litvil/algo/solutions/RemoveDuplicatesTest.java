package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.litvil.algo.solutions.RemoveDuplicates;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveDuplicatesTest {

  RemoveDuplicates task = new RemoveDuplicates();

  @Test
  public void test1() {
    assertEquals(List.of(0, 1, 2, 3, 4), task.cleanSorted(new int[] {0, 0, 1, 1, 2, 2, 2, 3, 4, 4}));
  }
  @Test
  public void test2() {
    assertEquals(List.of(1, 2, 3, 4, 5), task.cleanSorted(new int[] {1, 1, 2, 2, 2, 3, 4, 4, 5}));
  }

  @Test
  public void test3() {
    assertEquals(List.of(), task.cleanSorted(new int[] {}));
  }
  @Test

  public void test4() {
    assertEquals(List.of(1, 2, 3, 4, 5), task.cleanUnsorted(new int[] {1, 1, 2, 2, 2, 3, 1, 4, 4, 5}));
  }

  @Test
  public void test5() {
    assertEquals(List.of(1, 2, 3, 4, 5), task.clean(new int[] {1, 1, 2, 2, 2, 3, 1, 4, 4, 5}));
  }

  @Test
  public void test6() {
    assertEquals(List.of(1, 2, 3, 4, 5), task.clean(new int[] {1, 1, 2, 2, 2, 3, 1, 4, 4, 2, 5, 1}));
  }
}