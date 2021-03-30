package com.test.java;

import java.util.Arrays;

/*
 */
public class ArrayRotation {

  public int[] solution(int[] A, int K) {
    // write your code in Java SE 8
    int[] result = new int[A.length];

    if (K == 0 || A.length == 0) {
      return A;
    } else if (A.length == 1) {
      return A;
    } else if (K == A.length) {
      return A;
    } else if (K > A.length) {
      K = K % A.length;// change the original rotation value
    }



    // length=5 k=4

    for (int i = 0; i < A.length; i++) {
      int index = i + K;
      if (index >= A.length) {
        index = index - A.length;
      }

      if (index < A.length) {
        result[index] = A[i];
      }
    }



    System.out.println(Arrays.toString(result));
    return result;
  }

  // private int[] moveOne(int[] A) {
  //
  // }

}
