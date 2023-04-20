# OddNumberSorting
Task from Hogarth,
This Java program sorts odd numbers in an array in ascending order while keeping even numbers and zeros in their original positions.

## Problem Statement

Given an array of numbers, the task is to sort the odd numbers in ascending order while keeping the even numbers and zeros in their original positions.

## Solution

The solution provided sorts the input array according to the problem statement. The code is organized into two packages, one for the main logic and another for the unit tests.

### Main Package

**Package**: `com.oddNumberSorter.sortOddNumbers`

**Class**: `oddSorter`

**Method**: `public static int[] sortOddNumbers(int[] inputArray)`

This method takes an integer array as input and returns a new integer array with the sorted odd numbers.

### Test Package

**Package**: `com.oddnumber.test`

**Class**: `OddNumberTests`

This class contains various unit tests for the `sortOddNumbers` method using the JUnit framework and the `Assert` class for assertions.

## Usage

To use this code, simply import the `com.oddNumberSorter.sortOddNumbers.oddSorter` class in your Java project and call the `sortOddNumbers` method with an integer array as input:

```java
import com.oddNumberSorter.sortOddNumbers.oddSorter;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 2, 8, 1, 4};
        int[] sortedArray = oddSorter.sortOddNumbers(inputArray);

        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
}```

## Tests

The provided tests cover various scenarios:

1. Empty array.
2. Array with zero.
3. Array with no odd numbers.
4. Array with odd and even numbers.
5. Array with all odd numbers.

These tests use the JUnit framework and the `Assert` class to validate the results.


