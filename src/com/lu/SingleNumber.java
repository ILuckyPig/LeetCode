package com.lu;

/**
 * 异或运算
 * 1. 异或运算满足交换律、结合律
 *    即异或同一个数两次，原数不变
 * 2. 异或相同为0，不同为1.（java相同为0）
 *    x ^ x = 0
 *    0 ^ n = n
 * 2 ^ 3 ^ 1 ^ 3 ^ 2 => 2 ^ 2 ^ 3 ^ 3 ^ 1 => (2 ^ 2) ^ (3 ^ 3) ^ 1 => 0 ^ 0 ^ 1 => 1
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumber {

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 3};
        System.out.println(singleNumber(nums));
    }
}
