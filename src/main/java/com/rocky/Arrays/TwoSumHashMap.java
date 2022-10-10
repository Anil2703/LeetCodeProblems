package com.rocky.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

    //Time - O(n), Space -O(n)
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if(map.containsKey(target-x)) {
                return new int[]{map.get(target-x), i};
            }
            map.put(x,i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

    public static void main(String[] args) {

        int[] numbers = {2,3,7,5,4};

        int[] result = twoSum(numbers, 8);

        for(int i : result) {
            System.out.println(i);
        }

    }
}
