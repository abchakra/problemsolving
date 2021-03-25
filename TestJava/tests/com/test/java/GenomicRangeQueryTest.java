package com.test.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.test.java.prefixsum.GenomicRangeQuery;

public class GenomicRangeQueryTest {
  @Test
  public void test1() {

    GenomicRangeQuery instance = new GenomicRangeQuery();
    int[] ans = instance.solution("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6});
    assertArrayEquals("WRONG ANSWER", new int[] {2, 4, 1}, ans);

  }

  @Test
  public void test2() {

    GenomicRangeQuery instance = new GenomicRangeQuery();
    int[] ans = instance.solution("GGGGGGG", new int[] {2, 5, 0}, new int[] {4, 5, 6});
    assertArrayEquals("WRONG ANSWER", new int[] {3, 3, 3}, ans);

  }
}
