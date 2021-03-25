package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.timecomplexity.PermMissingElem;

public class PermMissingElemTest {

  @Test
  public void test1() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {1, 2, 3, 5});
    assertEquals("WRONG ANSWER", 4, ans);

  }



  @Test
  public void test2() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10});
    assertEquals("WRONG ANSWER", 6, ans);

  }

  @Test
  public void test3() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {1});
    assertEquals("WRONG ANSWER", 2, ans);

  }

  @Test
  public void test4() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {2,1});
    assertEquals("WRONG ANSWER", 3, ans);

  }

  @Test
  public void test5() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {2, 3, 4, 5});
    assertEquals("WRONG ANSWER", 1, ans);

  }

  @Test
  public void test6() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {1, 5,7,8,9,2, 3, 4});
    assertEquals("WRONG ANSWER", 6, ans);

  }
  
  @Test
  public void test7() {

    PermMissingElem instance = new PermMissingElem();
    int ans = instance.solution(new int[] {1, 2, 3, 4});
    assertEquals("WRONG ANSWER", 5, ans);

  }
}
