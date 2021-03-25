package com.test.java.timecomplexity;

public class TapeEquilibrium {



  public int solution(int[] A) {
    // write your code in Java SE 8

    int minimumDiff = Integer.MAX_VALUE;

    int total = 0;
    int sumUpto = 0;
    for (int i = 0; i < A.length; i++) {
      total += A[i];
    }

    for (int j = 0; j < A.length - 1; j++) {
      sumUpto += A[j];
      int sumRemainder = total - sumUpto;
      int diff = Math.abs(sumUpto - sumRemainder);
      if (diff < minimumDiff) {
        minimumDiff = diff;
      }

    }

    return minimumDiff;


  }



}


