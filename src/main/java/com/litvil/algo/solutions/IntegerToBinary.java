package com.litvil.algo.solutions;

/**
 * Converts integer number into binary representation
 */
public class IntegerToBinary {
  static String convert(int n) {

    // array to store binary number
    int[] binaryNum = new int[32];

    // counter for binary array
    int i = 0;
    while (n > 0) {
      // storing remainder in binary array
      binaryNum[i] = n % 2;
      n = n / 2;
      i++;
    }

    // printing binary array in reverse order
    StringBuilder out = new StringBuilder();
    for (int j = i - 1; j >= 0; j--) {
      out.append(binaryNum[j]);
    }
    return out.toString();

  }
}
