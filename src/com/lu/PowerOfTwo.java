package com.lu;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class PowerOfTwo {

    private static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
    }
}
