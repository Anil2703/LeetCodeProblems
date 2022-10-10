package com.rocky.Arrays;

public class TwoSumSortedPointers {

    //Time - O(n), Space -O(1)
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while(i<j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 7};
        int[] result = twoSum(numbers, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
