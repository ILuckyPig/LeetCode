package com.lu;

public class SingleNumber {
    static int singleNumber(int[] nums) {
        int i = 0;
        int j = i + 1;
        boolean flag = false;
        while (!(flag || (nums[i] == nums[j]))) {
            if (j++ == nums.length) {
                i++;
            }
            flag = nums[i] == nums[j];
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }
}
