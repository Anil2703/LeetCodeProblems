package com.rocky.Arrays;

public class TwoSumSortedBinarySearch {

    //Time - O(nlogn), Space -O(1)
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int j = binarySearch(numbers, target-numbers[i], i + 1);
            if (j != -1) {
                return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

    public static int binarySearch(int[] numbers, int key, int start) {
        int l = start;
        int r = numbers.length - 1;
        //{1,2,3,5,7}
        while (l < r) {
            int m = (l + r) / 2;
            if (numbers[m] < key) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return (l == r && numbers[l] == key) ? l : -1;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 7};
        int[] result = twoSum(numbers, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
