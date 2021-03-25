package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.timecomplexity.TapeEquilibrium;

public class TapeEquilibriumTest {

  @Test
  public void test1() {

    TapeEquilibrium bg = new TapeEquilibrium();

    assertEquals("WRONG ANSWER", 1, bg.solution(new int[] {3, 1, 2, 4, 3}));
  }

  @Test
  public void test2() {

    TapeEquilibrium bg = new TapeEquilibrium();

    assertEquals("WRONG ANSWER", 20, bg.solution(new int[] {-10, -20, -30, -40, 100}));
  }

}
