package com.rocky.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDataStructure {

    //add – O(1) runtime, find – O(n) runtime, O(n) space

    private Map<Integer, Integer> table = new HashMap<Integer, Integer>();
    public void add(int input) {
        int count = table.containsKey(input) ? table.get(input) : 0;
        table.put(input, count + 1);
    }
    public boolean find(int val) {
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            int num = entry.getKey();
            int y = val - num;
            if (y == num) {
                // For duplicates, ensure there are at least two individual numbers.
                if (entry.getValue() >= 2) return true;
            } else if (table.containsKey(y)) {
                return true;
            }
        }
        return false;
    }
}
