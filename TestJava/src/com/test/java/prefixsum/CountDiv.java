package com.test.java.prefixsum;

public class CountDiv {
  public int solution2(int A, int B, int K) {
    int div = 0;
    for (int i = A; i <= B; i++) {
      if (i % K == 0) {
        div += 1;
      }
    }

    return div;
  }
  //
  // public int solution(int A, int B, int K) {
  // int minRemainder = A % K;
  // int minQuotient = (int) Math.floor(A / K);
  // int maxQuotient = (int) Math.floor(B / K);
  // boolean includeFirstNum = minRemainder == 0;
  // int bonus = includeFirstNum ? 1 : 0;
  // int res = maxQuotient - minQuotient + bonus;
  // return res;
  // }

  public int solution(int A, int B, int K) {
    int inclusive = ((A % K) == 0) ? 1 : 0;
    return (B / K) - (A / K) + inclusive;
  }
}
