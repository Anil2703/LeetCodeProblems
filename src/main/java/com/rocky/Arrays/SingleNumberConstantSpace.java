package com.rocky.Arrays;

public class SingleNumberConstantSpace {

    public static int singleNumber(int[] numbers) {
        int ans = numbers[0];

        for(int i=1;i<numbers.length;i++) {
            ans = ans ^ numbers[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,5,2,4,5,6};
        System.out.println(singleNumber(nums));

    }
}
