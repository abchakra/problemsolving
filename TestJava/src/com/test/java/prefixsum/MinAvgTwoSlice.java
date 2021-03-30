package com.test.java.prefixsum;
// A[0] = 4
// A[1] = 2
// A[2] = 2
// A[3] = 5
// A[4] = 1
// A[5] = 5
// A[6] = 8
// slice (1, 2), whose average is (2 + 2) / 2 = 2;
// slice (3, 4), whose average is (5 + 1) / 2 = 3;
// slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.


public class MinAvgTwoSlice {
  public int solution2(int[] A) {
    float tempAverage, finalAverage = Float.MAX_VALUE;
    int startLocation = 0;
    int lengthOfTheSlice = 0;
    for (int i = 0; i < A.length - 1; ++i) {
      tempAverage = (float) (A[i] + A[i + 1]) / 2;
      if (tempAverage < finalAverage) {
        finalAverage = tempAverage;
        startLocation = i;
        lengthOfTheSlice = 2;
      }
    }
    for (int i = 0; i < A.length - 2; ++i) {
      tempAverage = (float) (A[i] + A[i + 1] + A[i + 2]) / 3;
      if (tempAverage < finalAverage) {
        finalAverage = tempAverage;
        startLocation = i;
        lengthOfTheSlice = 3;
      }
    }
    System.out.print("Length of the slice \t" + lengthOfTheSlice);
    return startLocation;
  }

  public int solution4(int[] A) {
    int N = A.length;
    double minAvg = Integer.MAX_VALUE;
    double sum = 0;
    int result = 0;
    for (int i = 0; i < N - 1; ++i) {
      sum = A[i];
      for (int j = i + 1; j < i + 3 && j < N; ++j) {
        sum += A[j];
        double avg = (sum / (j - i + 1));
        if (avg < minAvg) {
          minAvg = avg;
          result = i;
        }
      }
    }
    return result;
  }


  // A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤
  // P < Q < N, is called a slice of array A (notice that the slice contains at least two elements).
  // The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length
  // of the slice. To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
  public int solution(int[] A) {
    // write your code in Java SE 8

    float avg = 0f;
    int min_index = 0;
    int P = 0;
    // formula

    float sums[] = new float[A.length];

    // suffix sums
    int prefix = 0;
    for (int i = 0; i < A.length; i += 1) {
      prefix += A[i];
      sums[i] += prefix;
    }
    float min_avg = Float.MAX_VALUE;
    for (int i = 1; i < A.length; i++) {
      avg = (sums[i] - sums[P] + A[P]) / (i - P + 1);
      if (avg < min_avg) {
        min_avg = avg;
        min_index = P;
      }

      if (A[i] < min_avg) {
        P = i;
      }
    }


    return min_index;


  }

  // https://codesays.com/2014/solution-to-min-avg-two-slice-by-codility/
  public int solution1(int[] A) {

    // min slice len will always be less than 4 ,
    // imagine a slice of len 4 which can be divided in two slices of
    // len 2 which either has same avg or
    // any one of them having lesser avg (the other one will be greater)
    int index = 0;
    double minAvg = (A[A.length - 2] + A[A.length - 1]) / 2.0;

    int lengthOfTheSlice = 0;

    for (int i = 0; i < A.length - 2; i++) {
      double avg = (A[i] + A[i + 1]) / 2.0;

      if (avg < minAvg) {
        minAvg = avg;
        index = i;
        lengthOfTheSlice = 2;
      }
      avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
      if (avg < minAvg) {
        minAvg = avg;
        index = i;
        lengthOfTheSlice = 3;
      }
    }
    System.out.print("Length of the slice \t" + lengthOfTheSlice + "\t" + minAvg + "\t" + index);

    return index;
  }

}
