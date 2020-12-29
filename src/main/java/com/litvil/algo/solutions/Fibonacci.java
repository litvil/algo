package com.litvil.algo.solutions;

public class Fibonacci {
  /**
   * Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
   * Extra Space: O(n) if we consider the function call stack size, otherwise O(1).
   */
  public static class Simple {

    static int fib(int n) {
      if (n <= 1) {
        return n;
      }
      return fib(n - 1) + fib(n - 2);
    }
  }

  /**
   * We can avoid the repeated work done is method simpleFib by storing the Fibonacci numbers calculated so far.
   */
  public static class Dynamic {

    static int fib(int n) {
      /* Declare an array to store Fibonacci numbers. */
      int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
      int i;

      /* 0th and 1st number of the series are 0 and 1*/
      f[0] = 0;
      f[1] = 1;

      for (i = 2; i <= n; i++) {
        // Add the previous 2 numbers in the series and store it
        f[i] = f[i - 1] + f[i - 2];
      }

      return f[n];
    }
  }

  /**
   * Time Complexity:O(n)
   * Extra Space: O(1)
   */
  public static class OptimizedDynamic {

    static int fib(int n) {
      int a = 0, b = 1, c;
      if (n == 0) {
        return a;
      }
      for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
      }
      return b;
    }
  }

  /**
   * Below is one more interesting recurrence formula that can be used to find n’th Fibonacci Number in O(Log n) time.
   * <p>
   * If n is even then k = n/2:
   * F(n) = [2*F(k-1) + F(k)]*F(k)
   * <p>
   * If n is odd then k = (n + 1)/2
   * F(n) = F(k)*F(k) + F(k-1)*F(k-1)
   *
   * Time complexity of this solution is O(Log n) as we divide the problem to half in every recursive call.
   */
  public static class Formula {
    static int MAX = 1000;
    static int f[] = new int[MAX];;

    static int fib(int n) {
      // Base cases
      if (n == 0) {
        return 0;
      }

      if (n == 1 || n == 2) {
        return (f[n] = 1);
      }

      // If fib(n) is already computed
      if (f[n] != 0) {
        return f[n];
      }

      int k;
      if ((n & 1) == 1) {
        k = (n + 1) / 2;
        f[n] = fib(k) * fib(k) + fib(k - 1) * fib(k - 1);
      } else {
        k = n / 2;
        f[n] = (2 * fib(k - 1) + fib(k)) * fib(k);
      }

      return f[n];
    }
  }

  /**
   * In this method we directly implement the formula for nth term in the fibonacci series.
   * Fn = {[(√5 + 1)/2] ^ n} / √5
   * Reference: http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibFormula.html
   *
   * Time Complexity: O(1)
   * Space Complexity: O(1)
   */
  public static class Formula2 {

    static int fib(int n) {
      double phi = (1 + Math.sqrt(5)) / 2;
      return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
  }


  /**
   * This another O(n) which relies on the fact that if we n times multiply the matrix
   * M = {{1,1},{1,0}} to itself (in other words calculate power(M, n )),
   * then we get the (n+1)th Fibonacci number as the element at row and column (0, 0) in the resultant matrix.
   * <p>
   * Time Complexity:O(n)
   * Extra Space: O(1)
   */
  public static class Matrix {

    static int fib(int n) {
      int F[][] = new int[][] {{1, 1}, {1, 0}};
      if (n == 0) {
        return 0;
      }
      power(F, n - 1);

      return F[0][0];
    }

    /* Helper function that multiplies 2 matrices F and M of size 2*2, and
    puts the multiplication result back to F[][] */
    static private void multiply(int F[][], int M[][]) {
      int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
      int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
      int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
      int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

      F[0][0] = x;
      F[0][1] = y;
      F[1][0] = z;
      F[1][1] = w;
    }

    /* Helper function that calculates F[][] raise to the power n and puts the
    result in F[][]
    Note that this function is designed only for fib() and won't work as general
    power function */
    static private void power(int F[][], int n) {
      int i;
      int M[][] = new int[][] {{1, 1}, {1, 0}};

      // n - 1 times multiply the matrix to {{1,0},{0,1}}
      for (i = 2; i <= n; i++) {
        multiply(F, M);
      }
    }
  }

  /**
   * We can do recursive multiplication to get power(M, n) in the previous method
   * <p>
   * Time Complexity: O(Logn)
   * Extra Space: O(Logn) if we consider the function call stack size, otherwise O(1).
   */
  public static class OptimizedMatrix {

    static int fib(int n) {
      int F[][] = new int[][] {{1, 1}, {1, 0}};
      if (n == 0) {
        return 0;
      }
      power(F, n - 1);

      return F[0][0];
    }

    /* Helper function that multiplies 2 matrices F and M of size 2*2, and
    puts the multiplication result back to F[][] */
    static private void multiply(int F[][], int M[][]) {
      int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
      int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
      int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
      int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

      F[0][0] = x;
      F[0][1] = y;
      F[1][0] = z;
      F[1][1] = w;
    }

    /* Helper function that calculates F[][] raise to the power n and puts the
    result in F[][]
    Note that this function is designed only for fib() and won't work as general
    power function */
    static private void power(int F[][], int n) {
      if (n == 0 || n == 1) {
        return;
      }
      int M[][] = new int[][] {{1, 1}, {1, 0}};

      power(F, n / 2);
      multiply(F, F);

      if (n % 2 != 0) {
        multiply(F, M);
      }
    }
  }

}
