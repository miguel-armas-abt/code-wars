package org.codewars.kyu6.diamond;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
 *
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 *
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 *
 */
public class DiamondV1Test {
  @Test
  public void testDiamond3() {
    StringBuffer expected = new StringBuffer();
    expected.append(" *\n");
    expected.append("***\n");
    expected.append(" *\n");

    assertEquals(expected.toString(), DiamondV1.printDiamondV1(3));
  }

  @Test
  public void testDiamond5() {
    StringBuffer expected = new StringBuffer();
    expected.append("  *\n");
    expected.append(" ***\n");
    expected.append("*****\n");
    expected.append(" ***\n");
    expected.append("  *\n");

    assertEquals(expected.toString(), DiamondV1.printDiamondV1(5));
  }

  @Test
  public void testDiamond1() {
    StringBuffer expected = new StringBuffer();
    expected.append("*\n");
    assertEquals(expected.toString(), DiamondV1.printDiamondV1(1));
  }

  @Test
  public void testDiamond0() {
    assertEquals(null, DiamondV1.printDiamondV1(0));
  }

  @Test
  public void testDiamondMinus2() {
    assertEquals(null, DiamondV1.printDiamondV1(-2));
  }

  @Test
  public void testDiamond2() {
    assertEquals(null, DiamondV1.printDiamondV1(2));
  }
}
