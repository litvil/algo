package com.litvil.algo.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringLargerThanTest {

  StringLargerThan task = new StringLargerThan();

  @Test
  public void test1() {
    assertEquals(true, task.largerThan("2344", "234"));
  }

  @Test
  public void test2() {
    assertEquals(false, task.largerThan("111", "222"));
  }

  @Test
  public void test3() {
    assertEquals(false, task.largerThan("222", "222"));
  }

  @Test
  public void test4() {
    assertEquals(false, task.largerThan("12", "224442"));
  }

  @Test
  public void test5() {
    assertEquals(true, task.largerThan("123333", "34"));
  }
}