package org.codewars.kyu7.powdigits;

import java.util.concurrent.atomic.AtomicInteger;

public class PowDigits {

  public static void main(String[] args) {
    System.out.println(digPow(46288, 3));
  }

  public static long digPow(int n, int p) {
    AtomicInteger cont = new AtomicInteger(p);
    int sum = Integer.toString(n).chars()
        .map(number -> (int)Math.pow(Character.getNumericValue(number), cont.getAndIncrement()))
        .reduce(Integer::sum)
        .getAsInt();
    return sum % n == 0
        ? sum/n
        : -1;
  }
}
