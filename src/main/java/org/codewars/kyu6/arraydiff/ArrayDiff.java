package org.codewars.kyu6.arraydiff;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDiff {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrayDiff(new int[]{1,2,2}, new int[]{1})));
  }

  public static int[] arrayDiff(int[] arrayA, int[] arrayB) {
    return Arrays.stream(arrayA)
        .filter(numberA -> !Arrays.stream(arrayB).boxed().collect(Collectors.toList()).contains(numberA))
        .toArray();
  }

  public static int[] arrayDiffV2(int[] arrayA, int[] arrayB) {
    return IntStream.of(arrayA)
        .filter(numberA -> IntStream.of(arrayB).noneMatch(numberB -> numberB == numberA))
        .toArray();
  }
}
