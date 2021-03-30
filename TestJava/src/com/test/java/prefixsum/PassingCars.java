package com.test.java.prefixsum;

public class PassingCars {
  public int solution(int[] A) {


    int count = 0;
    int pairs = 0;

    for (int i = 0; i < A.length; i++) {
      int val = A[i];

      if (val == 0) {
        count += 1;
      } else if (val == 1) {
        pairs += count;
      }

      if (pairs > 1000000000) {
        return -1;
      }
    }


    return pairs;
  }
}
