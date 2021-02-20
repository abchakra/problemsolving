package com.test.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArrayRoationTest {

  @Test
  public void test1() {

    ArrayRotation ar = new ArrayRotation();

    assertArrayEquals("WRONG ANSWER", new int[] {5, 1, 2, 3, 4},
        ar.solution(new int[] {1, 2, 3, 4, 5}, 1));
  }



  @Test
  public void test2() {

    ArrayRotation ar = new ArrayRotation();

    assertArrayEquals("WRONG ANSWER", new int[] {0, 0, 0, 0},
        ar.solution(new int[] {0, 0, 0, 0}, 1));
  }

  @Test
  public void test3() {

    ArrayRotation ar = new ArrayRotation();

    assertArrayEquals("WRONG ANSWER", new int[] {9, 7, 6, 3, 8},
        ar.solution(new int[] {3, 8, 9, 7, 6}, 3));

  }

  @Test
  public void test4() {

    ArrayRotation ar = new ArrayRotation();

    assertArrayEquals("WRONG ANSWER", new int[] {4}, ar.solution(new int[] {4}, 3));

  }

  @Test
  public void test5() {

    ArrayRotation ar = new ArrayRotation();

    assertArrayEquals("WRONG ANSWER", new int[] {1, 2, 3, 4, 5},
        ar.solution(new int[] {1, 2, 3, 4, 5}, 5));

  }

  @Test
  public void test6() {

    ArrayRotation ar = new ArrayRotation();

    assertArrayEquals("WRONG ANSWER", new int[] {5, 1, 2, 3, 4},
        ar.solution(new int[] {1, 2, 3, 4, 5}, 11));

  }
}
