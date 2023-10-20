package org.codewars.kyu7.powdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
 *
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p.
 *
 * We want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
 * In other words: Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 *
 * If it is the case we will return k, if not return -1.
 * Note: n and p will always be given as strictly positive integers.
 */
public class PowDigitsTest {

  @Test
  public void Test1() {
    assertEquals(1, PowDigits.digPow(89, 1));
  }
  @Test
  public void Test2() {
    assertEquals(-1, PowDigits.digPow(92, 1));
  }
  @Test
  public void Test3() {
    assertEquals(51, PowDigits.digPow(46288, 3));
  }
}
