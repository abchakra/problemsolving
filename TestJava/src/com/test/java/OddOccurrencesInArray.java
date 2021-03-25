package com.test.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OddOccurrencesInArray {


  // Time: O(N)
  // Space: O(1)
  public static int solution(int[] A) {
    // write your code in Java SE 8
    int elem = 0;

    for (int i = 0; i < A.length; i++) {
      elem ^= A[i];
      System.out.println(elem);
    }
    return elem;
  }


  // Time: O(N)
  // Space: O(N)
  public int solution2(int[] A) {
    HashSet<Integer> dups = new HashSet<Integer>();
    int elem = -1;


    for (int i = 0; i < A.length; i++) {

      int key = A[i];
      if (dups.add(A[i])) {
        elem = key;
      }
    }


    return elem;
  }


  // O(N*log(N))

  public int solution1(int[] A) {
    if (A.length == 0) {
      return 0;
    } else if (A.length == 1) {
      return A[0];
    }

    Map<Integer, Integer> occuranceMap = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      int key = A[i];

      if (occuranceMap.containsKey(key)) {
        Integer occurances = occuranceMap.get(key);
        occurances++;
        occuranceMap.put(key, occurances);
      } else {
        occuranceMap.put(key, 1);
      }
    }

    Set<Integer> keySet = occuranceMap.keySet();

    for (int currentKey : keySet) {
      int occurrences = occuranceMap.get(currentKey);

      // System.out.println(currentKey + ":" + occurrences);
      // if occurs odd number of times, we found the unpaired value - no need to continue checking
      if (occurrences % 2 != 0)
        return currentKey;
    }
    // should never get to here
    throw new RuntimeException("shouldn't get to here - should've return unpaired value by now");

  }
}
