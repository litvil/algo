package com.litvil.algo.search;

/**
 * ompare two strings as number:
 *
 * You are given two non-negative integers in strings Example: ‘1221’ and ‘123’
 *
 * Write a function, larger_than (a, b)  which returns True if the first number is larger than the second one.
 *
 * Solve this problem without converting the stings to numbers
 *
 * You are given two strings which represent two integers for example ‘1232’ ‘201’
 *
 * Write a function that compares these two stings as numbers,
 *
 * write a function called larger than which takes two stings as input
 *
 * return true if the first number is larger than the second one;
 *
 * for example, 202 is less than 232 then should return false from this function.
 *
 * Clarifying questions:
 *
 * 1)     Could the strings be empty?
 *
 * No, you can assume they are never empty
 *
 * 2)     Could the number be negative?
 *
 * No, they are always non-negative they are always either zero or positive
 *
 * 3)     Can I user int(str) to convert the strings to number?
 *
 * No, Try solving this problem without converting them to number first.
 *
 * 4)     If they are same number for (22,22), they should return false
 */
public class StringLargerThan {

  // a = "201" b = "100"
  public Boolean largerThan(String a, String b) {
    if (a.length() > b.length()) {
      return true;
    }
    if (a.length() > b.length()) {
      return false;
    }

    if (a.length() == b.length()) {
      for (int i = 0; i < a.length(); i++) {

        char aChar = a.charAt(i);
        char bChar = b.charAt(i);

        final int result = Character.compare(aChar, bChar);
        if (result > 0) {
          return true;
        } else {
          if (result < 0) {
            return false;
          }
        }
      }
    }
    return false;
  }
}
