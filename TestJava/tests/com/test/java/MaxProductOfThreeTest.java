package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.sorting.MaxProductOfThree;

public class MaxProductOfThreeTest {
  @Test
  public void test1() {
    MaxProductOfThree ar = new MaxProductOfThree();
    assertEquals("WRONG ANSWER", 60, ar.solution(new int[] {-3, 1, 2, -2, 5, 6}));
  }

  @Test
  public void test2() {
    MaxProductOfThree ar = new MaxProductOfThree();
    assertEquals("WRONG ANSWER", 1, ar.solution(new int[] {1, 1, 1}));
  }

  @Test
  public void test3() {
    MaxProductOfThree ar = new MaxProductOfThree();
    assertEquals("WRONG ANSWER", 0, ar.solution(new int[] {1, 0, 0}));
  }
  
  @Test
  public void test4() {
    MaxProductOfThree ar = new MaxProductOfThree();
    assertEquals("WRONG ANSWER", 125, ar.solution(new int[] {-5, 5, -5, 4}));
  }
  
  // new Object [] { new int [] { -3, 1, 2, -2, 5, 6 }, 60 }, //2 * 5 * 60
  // new Object [] { new int [] { -3, 1, -100, 2, -2, 5, 6 }, 1800 }, //-100 * -3 * 6
  // new Object [] { new int [] { -3, 1, -100}, 300},
  // new Object [] { new int [] { -3, 1, 0, -100}, 300}, //-100 * -3 * 1
  // new Object [] { new int [] { -3, 1, 2, 0, -100}, 600}, //-100 * -3 * 2
  // new Object [] { new int [] { 10, 10, 10 }, 1000 },
  
//  -5, 5, -5, 4
}
