package com.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is
 * surrounded by ones at both ends in the binary representation of N.
 * 
 * @author chakraborty
 *
 */
public class BinaryGap {
  public int solution(int N) {
    String value = Integer.toBinaryString(N);
    System.out.println(value);
    int counter = 0;
    List<Integer> counters = new ArrayList<>();
    for (int i = 0; i < value.length(); i++) {
      char current = value.charAt(i);
      if (current == '0') {
        counter += 1;
      } else {
        counters.add(counter);
        counter = 0;
      }
    }
    System.out.println(counters);
    return Collections.max(counters);
  }
  // public int solution(int N) {
  // // write your code in Java SE 8
  //
  // String binaryStr = String.format("%32s", Integer.toBinaryString(N)).replaceAll(" ", "0");
  //
  // System.out.println(binaryStr);
  //
  // int maxBinaryGap = 0;
  // int tBinaryGap = 0;
  // boolean start = false;
  //
  // for (int i = 0; i <= binaryStr.length() - 1; i++) {
  // char ch = binaryStr.charAt(i);
  // if (ch == '1') {
  // if (start) {
  // // assign max binaryGap
  // if (tBinaryGap > maxBinaryGap) {
  // maxBinaryGap = tBinaryGap;
  // }
  // // reset
  // tBinaryGap = 0;
  // } else {
  // start = true;
  // }
  // }
  // if (ch == '0' && start) {
  // tBinaryGap++;
  // }
  //
  // }
  //
  //
  //
  // return maxBinaryGap;
  // }


}
