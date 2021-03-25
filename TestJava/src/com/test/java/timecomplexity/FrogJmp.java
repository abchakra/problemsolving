package com.test.java.timecomplexity;

public class FrogJmp {

  public int solution(int X, int Y, int D) {

    int distance = Y - X;

    int result = distance / D;
    if (distance % D != 0) {
      result = result + 1;
    }

    return result;
  }
}
