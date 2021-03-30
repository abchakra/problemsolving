package com.test.java.leader;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EquiLeader {
  public int solution(int[] A) {
    int length = A.length;
    int count = 0;

    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < length; i++) {
      int value = A[i];
      if (stack.size() == 0) {
        stack.push(value);
      } else if (stack.peek() == value) {
        stack.push(value);
      } else {
        stack.pop();
      }
    }

    // no equi leaders if stack is empty
    if (stack.isEmpty())
      return 0;
    int candidate = stack.peek().intValue();
    int dominatorCount = 0;

    Map<Integer, Integer> dominatorMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] == candidate) {
        dominatorCount++;
        dominatorMap.put(i, dominatorCount);
      }
    } // works for even and odd number of A elements //e.g. if A.length = 4, count needs to be > 2
    // e.g. if A.length = 5, count needs to be > 2
    int equiLeaders = 0;
    if (dominatorCount > (A.length / 2)) {
      // find all equi leader sequences

      int lastCandidateOccurenceIndex = 0;
      int runningDominatorCount = 0;
      for (int i = 0; i < A.length - 1; i++) {
        if (A[i] == candidate) {
          lastCandidateOccurenceIndex = i;
          runningDominatorCount = dominatorMap.get(i).intValue();
        } else if (dominatorMap.get(lastCandidateOccurenceIndex) != null) {
          runningDominatorCount = dominatorMap.get(lastCandidateOccurenceIndex).intValue();
        }
        if (runningDominatorCount > (i + 1) / 2) {
          if ((dominatorCount - runningDominatorCount) > (A.length - (i + 1)) / 2) {
            equiLeaders++;
          }
        }
      }
    }
    return equiLeaders;
  }

  public static void main(String[] args) {
    EquiLeader sol = new EquiLeader();
    int result = sol.solution(new int[] {4, 3, 4, 4, 4, 2});

    if (result == 2) {
      System.out.println("Success");
    }

  }

}
