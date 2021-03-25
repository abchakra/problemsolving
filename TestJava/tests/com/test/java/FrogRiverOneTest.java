package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.countingelements.FrogRiverOne;

public class FrogRiverOneTest {
  @Test
  public void test1() {

    FrogRiverOne bg = new FrogRiverOne();

    assertEquals("WRONG ANSWER", 6, bg.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
  }
  
  
  @Test
  public void test2() {

    FrogRiverOne bg = new FrogRiverOne();

    assertEquals("WRONG ANSWER", -1, bg.solution(5, new int[] {3}));
  }
  
  @Test
  public void test3() {

    FrogRiverOne bg = new FrogRiverOne();

    assertEquals("WRONG ANSWER", -1, bg.solution(5, new int[] {3,3,3,3,3}));
  }
  
  @Test
  public void test4() {

    FrogRiverOne bg = new FrogRiverOne();

    assertEquals("WRONG ANSWER", -1, bg.solution(5, new int[] {5,5,5,5,5}));
  }
  @Test
  public void test5() {

    FrogRiverOne bg = new FrogRiverOne();

    assertEquals("WRONG ANSWER", 4, bg.solution(5, new int[] {1,2,3,4,5}));
  }
}
