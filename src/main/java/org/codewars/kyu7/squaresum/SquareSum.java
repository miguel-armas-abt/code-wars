package org.codewars.kyu7.squaresum;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9.
 */

import java.util.Arrays;

public class SquareSum {
  public static void main(String[] args) {
    int[] values = new int[]{1, 2, 2};
    System.out.println(squareSum(values) + "");
  }

  public static int squareSum(int[] n) {
    return (int) Arrays.stream(n)
        .mapToDouble(x -> Math.pow(x, 2))
        .reduce(0, Double::sum);
  }
}
