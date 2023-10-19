package org.codewars.kyu6.charactercounter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounter {

  public static void main(String[] args) {
    System.out.println(count("AAAaaabcdeeEE"));
    System.out.println(countV2("AAAaaabcdeeEE"));
  }

  public static Map<Character, Integer> count(String str) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    str.chars().forEach(character -> hashMap.put((char)character, (int)str.chars().filter(ch -> ((char)character) == ch).count()));
    return hashMap;
  }

  public static Map<Character, Integer> countV2(String str) {
    return str
        .chars()
        .mapToObj(character -> (char) character)
        .collect(Collectors.toMap(character -> character, character -> 1, Integer::sum));
  }
}
