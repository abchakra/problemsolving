package com.test.java.countingelements;

import java.util.Arrays;

public class MaxCounters {


  // O(N + M)
  public int[] solution(int N, int[] A) {

    int[] counterArray = new int[N];


    int lastMax = 0;
    int currentMax = 0;
    boolean maxApplied = false;

    for (int i = 0; i < A.length; i++) {
      int operation = A[i];
      if (operation <= N) {
        // increment at location i+1
        int value = counterArray[operation - 1];
        if (maxApplied && value < lastMax) {
          counterArray[operation - 1] = lastMax;
        }
        counterArray[operation - 1] += 1;
        if (currentMax < counterArray[operation - 1]) {
          currentMax = counterArray[operation - 1];
        }
      } else if (operation > N) {
        maxApplied = true;
        lastMax = currentMax;
      }

    }

    for (int j = 0; j < N; j++) {
      counterArray[j] = counterArray[j] < lastMax ? lastMax : counterArray[j];
    }
    return counterArray;
  }

  public int[] solution1(int N, int[] A) {

    int[] counterArray = new int[N];


    int max = 0;
    for (int i = 0; i < A.length; i++) {
      int operation = A[i];
      if (operation <= N) {
        // increment at location i+1
        counterArray[operation - 1] += 1;
        max = counterArray[operation - 1] > max ? counterArray[operation - 1] : max;
      } else if (operation > N) {

        Arrays.fill(counterArray, max);
      }

    }
    return counterArray;
  }
}
