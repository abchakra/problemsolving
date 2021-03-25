package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OddOccurrencesInArrayTest {


  @Test
  public void test1() {

    OddOccurrencesInArray ar = new OddOccurrencesInArray();
    int ans = ar.solution(new int[] {9, 3, 9, 3, 9, 7, 9});
    assertEquals("WRONG ANSWER", 7, ans);

  }

  @Test
  public void test2() {

    OddOccurrencesInArray ar = new OddOccurrencesInArray();
    int ans = ar.solution(new int[] {1, 2, 1, 3, 5, 2, 3});
    assertEquals("WRONG ANSWER", 5, ans);

  }

}
