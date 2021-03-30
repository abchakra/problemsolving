package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.leader.Dominator;

public class DominatorTest {
  @Test
  public void test1() {
    Dominator ar = new Dominator();
    assertEquals("WRONG ANSWER", 7, ar.solution(new int[] {3, 4, 3, 2, 3, -1, 3, 3}));
  }
  
  @Test
  public void test2() {
    Dominator ar = new Dominator();
    assertEquals("WRONG ANSWER", -1, ar.solution(new int[] {}));
  }

}
