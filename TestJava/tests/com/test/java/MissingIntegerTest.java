package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.countingelements.MissingInteger;

public class MissingIntegerTest {
  @Test
  public void test1() {

    MissingInteger bg = new MissingInteger();
    int result = bg.solution(new int[] {1, 3, 6, 4, 1, 2});
    assertEquals("WRONG ANSWER", 5, result);
  }

  @Test
  public void test2() {

    MissingInteger bg = new MissingInteger();
    int result = bg.solution(new int[] {1, 2, 3});
    assertEquals("WRONG ANSWER", 4, result);
  }


  @Test
  public void test3() {

    MissingInteger bg = new MissingInteger();
    int result = bg.solution(new int[] {-2, -1});
    assertEquals("WRONG ANSWER", 1, result);
  }

}
