package com.test.java.countingelements;

public class PermCheck {
  public int solution(int[] A) {
    int max = A.length;

    // This is to track the number
    int[] flags = new int[max];

    for (int i = 0; i < max; i++) {
      int value = A[i];
      try {
        flags[value - 1] = 1;
      } catch (ArrayIndexOutOfBoundsException e) {
        return 0;
      }
    }

    for (int i = 0; i < max; i++) {
      if (flags[i] == 0) {
        return 0;
      }
    }

    return 1;
  }

  public int solution1(int[] A) {
    int max = 0;

    // System.out.println(Integer.MAX_VALUE > 1000000000);
    for (int i = 0; i < A.length; i++) {
      int value = A[i];
      // set new max
      max = max < value ? value : max;
    }

    // This is to track the number
    int[] flags = new int[max];
    int desiredSum = (max * (max + 1)) / 2;

    for (int i = 0; i < A.length; i++) {
      int value = A[i];
      if (flags[value - 1] == 0) {
        flags[value - 1] = 1;
        desiredSum -= value;
      } else {
        return 0;
      }
    }


    if (desiredSum == 0) {
      return 1;
    }

    return 0;
  }
}
