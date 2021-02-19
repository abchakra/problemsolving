package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinaryGapTest {

  @Test
  public void test1() {

    BinaryGap bg = new BinaryGap();

    assertEquals("WRONG ANSWER", 5, bg.solution(1041));
  }

  @Test
  public void test2() {

    BinaryGap bg = new BinaryGap();

    assertEquals("WRONG ANSWER", 0, bg.solution(15));
  }



  @Test
  public void test3() {

    BinaryGap bg = new BinaryGap();

    assertEquals("WRONG ANSWER", 4, bg.solution(529));
  }


}
