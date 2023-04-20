package com.oddnumber.test;

import org.junit.Assert;
import org.junit.Test;
import com.oddNumberSorter.sortOddNumbers.oddSorter;

public class OddNumberTests {
	@Test()
	public void testEmptyArray() {
		int[] inputArray = {};
		int[] expectedResult = {};
		Assert.assertArrayEquals(expectedResult, oddSorter.sortOddNumbers(inputArray));
	}
	@Test
	public void testZeroArray() {
		int[] inputArray = {4, 7, 0, 6, 5};
		int[] expectedResult = {4, 5, 0, 6, 7};
		Assert.assertArrayEquals(expectedResult, oddSorter.sortOddNumbers(inputArray));
	}
	@Test
	public void testArrayWithNoOddNumbers() {
		int[] inputArray = { 2, 4, 6, 8 };
		int[] expectedResult = { 2, 4, 6, 8 };
		Assert.assertArrayEquals(expectedResult, oddSorter.sortOddNumbers(inputArray));
	}

	@Test
	public void testArrayWithOddAndEvenNumbers() {
		int[] inputArray = { 5, 3, 2, 8, 1, 4 };
		int[] expectedResult = { 1, 3, 2, 8, 5, 4 };
		Assert.assertArrayEquals(expectedResult, oddSorter.sortOddNumbers(inputArray));
	}

	@Test
	public void testArrayWithAllOddNumbers() {
		int[] inputArray = { 9, 7, 5, 3, 1 };
		int[] expectedResult = { 1, 3, 5, 7, 9 };
		Assert.assertArrayEquals(expectedResult, oddSorter.sortOddNumbers(inputArray));
	}
}
