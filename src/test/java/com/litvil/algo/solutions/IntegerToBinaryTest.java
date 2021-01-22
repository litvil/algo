package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntegerToBinaryTest {
  @Test
  @DisplayName("Run")
  public void test1() {
    assertEquals("10001", IntegerToBinary.convert(17));
    assertEquals("1000010001", IntegerToBinary.convert(529));
    assertEquals("10000010001", IntegerToBinary.convert(1041));
    assertEquals("100000", IntegerToBinary.convert(32));
  }

  @Test
  @DisplayName("Run with Java")
  public void test2() {
    assertEquals("10001", IntegerToBinary.convertJava(17));
    assertEquals("1000010001", IntegerToBinary.convertJava(529));
    assertEquals("10000010001", IntegerToBinary.convertJava(1041));
    assertEquals("100000", IntegerToBinary.convertJava(32));
  }
}