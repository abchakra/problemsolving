package com.test.java;

import java.util.Scanner;

public class SumNumbers {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long minSum = 0, maxSum = 0;

		long sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (j != i) {
					sum = sum + arr[j];
				}
			}
			if (maxSum < sum) {
				maxSum = sum;
			}
			if (minSum > sum || minSum == 0) {
				minSum = sum;
			}
			sum = 0;// reset

		}
		System.out.println(minSum + " " + maxSum);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		int[] arr = new int[5];
//
//		String[] arrItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		for (int i = 0; i < 5; i++) {
//			int arrItem = Integer.parseInt(arrItems[i]);
//			arr[i] = arrItem;
//		}

//		miniMaxSum(new int[] { 1, 2, 3, 4, 5 });
		miniMaxSum(new int[] { 256741038,623958417, 467905213 ,714532089 ,938071625});
		

		scanner.close();
	}
}