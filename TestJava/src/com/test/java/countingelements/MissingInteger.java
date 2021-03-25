package com.test.java.countingelements;

public class MissingInteger {
  public int solution(int[] A) {

    int minMissing = Integer.MAX_VALUE;
    int remainingSum = Integer.MAX_VALUE;


    int max = 0;
    for (int i = 0; i < A.length; i++) {
      int value = A[i];
      // set new max
      max = max < value ? value : max;

    }

    // This is to track the number
    int[] flags = new int[max];
    int desiredSum = (max * (max + 1)) / 2;

    for (int j = 0; j < A.length; j++) {
      int value = A[j];
      if (value > 0) {
        if (flags[value - 1] == 0) {
          flags[value - 1] = 1;
          remainingSum = desiredSum - value;
        }
      }
    }
    for (int k = 0; k < max; k++) {
      if (flags[k] == 0) {
        minMissing = k + 1;
        break;
      }
    }

    if (remainingSum == 0 || minMissing == Integer.MAX_VALUE) {
      return max + 1;
    }

    return minMissing;
  }
}
