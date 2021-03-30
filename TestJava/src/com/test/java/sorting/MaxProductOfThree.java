package com.test.java.sorting;

import java.util.Arrays;

public class MaxProductOfThree {
  public int solution(int[] A) {
    Arrays.sort(A);
    int length = A.length;

    int max1, max2, max3, max4 = 0;
    max1 = A[length - 3] * A[length - 2] * A[length - 1];
    max2 = A[0] * A[1] * A[2];
    max3 = A[length - 1] * A[0] * A[1];
    max4 = A[0] * A[length - 2] * A[length - 1];

    int max12 = Math.max(max1, max2);
    int max34 = Math.max(max3, max4);


    return Math.max(max12, max34);
  }
}
