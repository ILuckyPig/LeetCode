package com.lu;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
//        System.out.println(isPalindromeNumber(x));
        System.out.println(isPalindromeNumberByString(x));
    }

    /**
     * 不将整数转为字符串的方式
     * @param x
     * @return
     */
    static boolean isPalindromeNumber(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int tmp = x;
        int length = 0;
        while (tmp > 0) {
            tmp = tmp / 10;
            length++;
        }

        for (int i = 0; i <= length / 2; i++) {
            int left;
            if (i == 0) {
                left = x % 10;
            } else {
                left = (int) (x / Math.pow(10, i) % 10);
            }
            int right = (int) (x / (Math.pow(10, (length - i - 1))) % 10);
            if (left != right) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindromeNumberByString(int x) {
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        String string = sb.toString();
        String reverseString = sb.reverse().toString();
        if (string.equals(reverseString)) {
            return true;
        }
        return false;
    }
}
