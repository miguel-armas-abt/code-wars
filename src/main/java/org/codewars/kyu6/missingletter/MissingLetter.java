package org.codewars.kyu6.missingletter;

import java.util.stream.IntStream;

public class MissingLetter {

  public static void main(String[] args) {
//    char[] charArray  = new char[] { 'a','b','c','d','f' };
    char[] charArray  = new char[] { 'O','Q','R','S' };
    System.out.println(findMissingLetter(charArray));
  }

  public static char findMissingLetter(char[] charArray) {
    int previousIndex = IntStream.range(0, charArray.length - 1)
        .filter(index -> !(charArray[index] == (charArray[index+1]-1)))
        .findFirst()
        .getAsInt();
    return (char)(charArray[previousIndex] + 1);
  }
}
