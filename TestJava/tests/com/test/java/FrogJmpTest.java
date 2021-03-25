package com.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.java.timecomplexity.FrogJmp;

public class FrogJmpTest {


  @Test
  public void test1() {

    FrogJmp instance = new FrogJmp();
    int ans = instance.solution(10, 85, 30);
    assertEquals("WRONG ANSWER", 3, ans);

  }


}
