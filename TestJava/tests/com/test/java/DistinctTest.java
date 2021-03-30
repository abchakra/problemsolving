package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.sorting.Distinct;

public class DistinctTest {
  @Test
  public void test1() {
    Distinct ar = new Distinct();
    assertEquals("WRONG ANSWER", 3, ar.solution(new int[] {2, 1, 1, 2, 3, 1}));
  }

  @Test
  public void test2() {
    Distinct ar = new Distinct();
    assertEquals("WRONG ANSWER", 1, ar.solution(new int[] {2, 2, 2,}));
  }

  @Test
  public void test3() {
    Distinct ar = new Distinct();
    assertEquals("WRONG ANSWER", 2, ar.solution(new int[] {1, 2, 1, 2}));
  }

  @Test
  public void test4() {
    Distinct ar = new Distinct();
    assertEquals("WRONG ANSWER", 1, ar.solution(new int[] {0}));
  }

  @Test
  public void test5() {
    Distinct ar = new Distinct();
    assertEquals("WRONG ANSWER", 0, ar.solution(new int[] {}));
  }
}
