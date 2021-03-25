package com.test.java;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import org.junit.Test;
import com.test.java.prefixsum.CountDiv;

public class CountDivTest {
  @Test
  public void test1() {
    CountDiv instance = new CountDiv();
    int ans = instance.solution(6, 11, 2);
    assertEquals("WRONG ANSWER", 3, ans);
  }


  @Test
  public void test2() {
    CountDiv instance = new CountDiv();
    int ans = instance.solution(10, 11, 2);
    assertEquals("WRONG ANSWER", 1, ans);
  }


  @Test
  public void test31() {
    CountDiv instance = new CountDiv();
    int ans = instance.solution(0, 5, 2);
    assertEquals("WRONG ANSWER", 3, ans);
  }


  @Test
  public void test3() {
    CountDiv instance = new CountDiv();
    int ans = instance.solution(0, 10, 2);
    assertEquals("WRONG ANSWER", 6, ans);
  }

  @Test
  public void test4() {
    CountDiv instance = new CountDiv();
    int ans = instance.solution(0, 2000000000, 1);
    assertEquals("WRONG ANSWER", 2000000001, ans);
  }


  @Test
  public void test5() {
    Instant one = Instant.ofEpochSecond(new Date().getTime());
    CountDiv instance = new CountDiv();
    int ans = instance.solution(0, 2000000000, 2);

    Instant two = Instant.ofEpochSecond(new Date().getTime());
    Duration res = Duration.between(one, two);
    System.out.println("Total time" + res.getSeconds());
    assertEquals("WRONG ANSWER", 1000000001, ans);
  }



}
