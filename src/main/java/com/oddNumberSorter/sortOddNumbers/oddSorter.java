package com.oddNumberSorter.sortOddNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class oddSorter {

	public static int[] sortOddNumbers(int[] inputArray) {
		List<Integer> oddNumbers = new ArrayList<Integer>();

		for (int n : inputArray) {
			if (n % 2 != 0) {
				oddNumbers.add(n);
			}
		}

		Collections.sort(oddNumbers);
		
		int oddIndex = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 != 0) {
				inputArray[i] = oddNumbers.get(oddIndex++);
			}
		}

		return inputArray;
	}
}
