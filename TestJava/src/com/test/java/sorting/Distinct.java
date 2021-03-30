package com.test.java.sorting;

import java.util.Arrays;

public class Distinct {

  public int solution(int[] A) {
    int count = 0;
    if (A.length > 0) {
      Arrays.sort(A);
      count = 1;
      int num = A[0];
      for (int i = 1; i < A.length; i++) {
        int val = A[i];
        if (val != num) {
          count += 1;
          num = val;
        }
      }


    }
    return count;

  }
}
