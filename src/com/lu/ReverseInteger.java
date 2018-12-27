package com.lu;

/**
 *  给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *  假设我们的环境只能存储得下 32 位的有符号整数，
 *  则其数值范围为 [−2^31,2^31−1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class ReverseInteger {

    private static int reverse(int x) {
        int result = 0;
        int pop = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            pop = x % 10;
            result = result * 10 + pop;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(reverse(-2147483412));
    }
}
