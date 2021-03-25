package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.prefixsum.MinAvgTwoSlice;

public class MinAvgTwoSliceTest {

  @Test
  public void test1() {

    MinAvgTwoSlice instance = new MinAvgTwoSlice();
    int ans = instance.solution(new int[] {4, 2, 2, 5, 1, 5, 8});
    assertEquals("WRONG ANSWER", 1, ans);

  }
  
  @Test
  public void test2() {

    MinAvgTwoSlice instance = new MinAvgTwoSlice();
    int ans = instance.solution(new int[] {4, 2});
    assertEquals("WRONG ANSWER", 0, ans);

  }
  @Test
  public void test3() {

    MinAvgTwoSlice instance = new MinAvgTwoSlice();
    int ans = instance.solution(new int[] {-3, -5, -8, -4, -10});
    assertEquals("WRONG ANSWER", 2, ans);

  }
  
}
