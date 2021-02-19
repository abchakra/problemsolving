package com.test.java;

class Challenge {
	// Complete this function to return either
	// "Hello, [name]!" or "Hello there!"
	// based on the input

	public static String sayHello(String name) {
		// You can print to STDOUT for debugging if you need to:
//		System.out.print("Hello, " + name);

		StringBuilder sb = new StringBuilder("Hello");

		if (name.trim().isEmpty()) {

			sb.append(" there");
		} else {
			sb.append(", " + name);
		}
		sb.append("!");

		// but you need to return the correct value in order to pass the challenge
		return sb.toString(); // TODO: return the correct value
	}
}