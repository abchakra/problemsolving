package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.countingelements.PermCheck;

public class PermCheckTest {
//  @Test
//  public void test1() {
//    PermCheck instance = new PermCheck();
//    int ans = instance.solution(new int[] {1, 2, 4});
//    assertEquals("WRONG ANSWER", 0, ans);
//  }
//
//
//  @Test
//  public void test2() {
//    PermCheck instance = new PermCheck();
//    int ans = instance.solution(new int[] {1, 2, 3, 4});
//    assertEquals("WRONG ANSWER", 1, ans);
//  }
//
//  @Test
//  public void test3() {
//    PermCheck instance = new PermCheck();
//    int ans = instance.solution(new int[] {1, 2, 2, 3, 4});
//    assertEquals("WRONG ANSWER", 0, ans);
//  }

  @Test
  public void test4() {
    PermCheck instance = new PermCheck();
    int ans = instance.solution(new int[] {1000000000});
    assertEquals("WRONG ANSWER", 0, ans);
  }
}
