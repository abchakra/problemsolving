package com.test.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DiskSpace {

	public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {

		if (blockSize < 1 || blockSize > 1000000) {
			throw new IllegalArgumentException();
		}
		if (fileSize < 1 || fileSize > blockSize) {
			throw new IllegalArgumentException();
		}
		if (blockSize > 0) {
			if (fileSize > 0) {
				if (occupiedSectors.isEmpty()) {
					if (fileSize <= blockSize) {
						return true;
					}
				} else {
					List<Integer> sortedSectors = new ArrayList<Integer>(new TreeSet<Integer>(occupiedSectors));

					// check first element
					if (sortedSectors.get(0) - 1 >= fileSize) {
						return true;
					}
					if (sortedSectors.size() > 1) {
						for (int i = 0; i < sortedSectors.size() - 1; i++) {
							Integer iVal = sortedSectors.get(i);
							Integer jVal = sortedSectors.get(i + 1);
							if (jVal - iVal >= fileSize) {
								return true;
							}
						}
					} else {

					}

				}
			}
		}
		return false;
	}
}