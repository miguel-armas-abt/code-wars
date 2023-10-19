package org.codewars.kyu6.missingletter;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
 *
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 *
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 */
public class MissingLetterTest {

  @Test
  public void exampleTests() {
    assertEquals('e', MissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
    assertEquals('P', MissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
  }
}
