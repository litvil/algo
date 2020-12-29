package com.litvil.algo.solutions;

import static org.junit.jupiter.api.Assertions.*;

import com.litvil.algo.sorting.BinaryInsertionSort;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
class FibonacciTest {
  @Test
  @DisplayName("Simple fibonacci")
  public void test1() {
    assertEquals(34, Fibonacci.Simple.fib(9));
  }

  @Test
  @DisplayName("Fibonacci no recursion")
  public void test2() {
    assertEquals(34, Fibonacci.Dynamic.fib(9));
  }

  @Test
  @DisplayName("Fibonacci no recursion optimized")
  public void test3() {
    assertEquals(34, Fibonacci.OptimizedDynamic.fib(9));
  }

  @Test
  @DisplayName("Fibonacci with matrix")
  public void test4() {
    assertEquals(34, Fibonacci.Matrix.fib(9));
  }

  @Test
  @DisplayName("Fibonacci with optimized matrix")
  public void test5() {
    assertEquals(34, Fibonacci.OptimizedMatrix.fib(9));
  }

  @Test
  @DisplayName("Fibonacci with formula")
  public void test6() {
    assertEquals(34, Fibonacci.Formula.fib(9));
  }

  @Test
  @DisplayName("Fibonacci with formula 2")
  public void test7() {
    assertEquals(34, Fibonacci.Formula2.fib(9));
  }
}