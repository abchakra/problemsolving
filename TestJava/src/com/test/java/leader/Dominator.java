package com.test.java.leader;

import java.util.Stack;

public class Dominator {
  public int solution(int[] A) {
    int leader = -1;
    int candidate = 0;
    int length = A.length;
    int count = 0;
    int num = Integer.MAX_VALUE;

    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < length; i++) {
      int value = A[i];
      if (stack.size() == 0) {
        stack.push(value);
      } else if (stack.peek() != value) {
        stack.pop();
      } else {
        stack.push(value);
      }
    }

    if (!stack.isEmpty())
      num = stack.peek();
    for (int i = 0; i < length; i++) {
      int value = A[i];
      if (value == num) {
        count += 1;
        candidate = i;
      }
    }

    if (count > length / 2) {
      leader = candidate;
    }
    return leader;
  }

}
