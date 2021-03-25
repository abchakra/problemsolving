package com.test.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.test.java.countingelements.MaxCounters;

public class MaxCountersTest {
  @Test
  public void test1() {

    MaxCounters bg = new MaxCounters();
    int[] result = bg.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4});
    assertArrayEquals("WRONG ANSWER", new int[] {3, 2, 2, 4, 2}, result);
  }

  
  @Test
  public void test2() {
    MaxCounters bg = new MaxCounters();
    int[] result = bg.solution(5, new int[] {4, 4, 4, 4});
    assertArrayEquals("WRONG ANSWER", new int[] {0, 0, 0, 4, 0}, result);
  }
  
  @Test
  public void test3() {
    MaxCounters bg = new MaxCounters();
    int[] result = bg.solution(5, new int[] {4, 4, 4, 5});
    assertArrayEquals("WRONG ANSWER", new int[] {0, 0, 0, 3, 1}, result);
  }
  
  @Test
  public void test4() {
    MaxCounters bg = new MaxCounters();
    int[] result = bg.solution(5, new int[] {6, 6, 6, 6});
    assertArrayEquals("WRONG ANSWER", new int[] {0, 0, 0, 0, 0}, result);
  }
}
