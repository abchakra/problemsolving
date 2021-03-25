package com.test.java.timecomplexity;

public class PermMissingElem {

  public int solution(int[] A) {

    // if (A.length == 1) {
    // int value = A[0];
    // if (value == 1)
    // return value;
    // }
    // long total = 0;
    // int max = 0;
    //
    // for (int i = 0; i < A.length; i++) {
    // int value = A[i];
    // total = total + value;
    // if (max < value) {
    // max = value;
    // }
    // }
    //
    //
    // long sum = (max * (max + 1)) / 2;
    // int result = (int) (sum - total);
    // if (result == 0) {
    // return result + 1;
    // } else {
    // return result;
    // }


    long N = A.length + 1;
    long sum = N * (N + 1) / 2;
    for (int i = 0; i < A.length; i++) {
      sum -= A[i];
    }
    return (int) sum;

  }

}
