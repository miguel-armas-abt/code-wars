package org.codewars.kyu6.diamond;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiamondV1 {

  public static void main(String[] args) {
    System.out.println(printDiamondV1(15));
  }

  public static String printDiamondV1(int number) {
    return isEvenOrPositive.test(number)
        ? null
        : IntStream.range(0, number)
        .mapToObj(columnIndex -> isIndexLessThanOrEqualToHalf.test(number, columnIndex)
            ? printTopAndCenter.apply(number, columnIndex)
            : printBottom.apply(number, columnIndex))
        .collect(Collectors.joining());
  }
  private static final Predicate<Integer> isEvenOrPositive = number -> number % 2 == 0 || number < 0;

  private static final BiFunction<Integer, Integer, String> printTopAndCenter = (number, columnIndex) ->
      " ".repeat((number/2) - columnIndex)
          .concat("*".repeat(2*columnIndex + 1))
          .concat("\n");

  private static final BiFunction<Integer, Integer, String> printBottom = (number, columnIndex) ->
      " ".repeat(columnIndex - (number/2))
          .concat("*".repeat(2*(number - columnIndex) - 1))
          .concat("\n");

  private static final BiPredicate<Integer, Integer> isIndexLessThanOrEqualToHalf = (number, columnIndex) -> columnIndex <= number/2;
}


