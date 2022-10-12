package com.rocky.Arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();

    }

    public static void main(String[] args) {

        int[] nums = {4,2,5,2,4,5,6};
        System.out.println(singleNumber(nums));
    }
}
