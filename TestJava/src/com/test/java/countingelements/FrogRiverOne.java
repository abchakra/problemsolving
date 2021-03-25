package com.test.java.countingelements;

public class FrogRiverOne {
  public int solution(int X, int[] A) {
    int time = -1;
    int sum = 0;


    // track the leaf has fallen once
    int[] flags = new int[X + 1];
    // Equivalent to all the leafs have fallen.
    int desiredSum = (X * (X + 1)) / 2;

    for (int i = 0; i < A.length; i++) {
      int value = A[i];

      // Verify if the leaf [i] has fallen.
      if (value <= X && flags[value] == 0) {
        flags[value] = 1;
        sum += value;
      }

      if (desiredSum == sum) {
        return i;
      }

    }

    return time;

  }
}
