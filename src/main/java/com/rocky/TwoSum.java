package com.rocky;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) {
                return new int[] { map.get(target - x) + 1, i + 1 };
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] intArray = {1,2,4,4};
        int[] pairs = twoSum(intArray, 8);

        for(Integer i : pairs) {
            System.out.println(i);
        }
    }
}
