package org.codewars.kyu6.diamond;

import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 *
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 *
 */
public class DiamondV2 {

  public static void main(String[] args) {
    System.out.println(printDiamondV2(15));
  }

  public static String printDiamondV2(int number) {
    return isEvenOrPositive.test(number)
        ? null
        : IntStream.range(0, number)
        .mapToObj(columnIndex -> printSpaces.apply(number, columnIndex) +  printAsterisks.apply(number, columnIndex))
        .collect(Collectors.joining("\n")) + "\n";
  }

  private static final Predicate<Integer> isEvenOrPositive = number -> number % 2 == 0 || number < 0;

  private static final BiFunction<Integer, Integer, String> printSpaces = (number, columnIndex) ->
      String.join("", Collections.nCopies(Math.abs(number/2 - columnIndex), " "));

  private static final BiFunction<Integer, Integer, String> printAsterisks = (number, columnIndex) ->
      String.join("", Collections.nCopies(number - 2 * Math.abs(number/2 - columnIndex), "*"));
}


