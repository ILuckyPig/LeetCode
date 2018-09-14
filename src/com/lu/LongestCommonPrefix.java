package com.lu;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * ["flower","flow","flight"] => "fl"
 * ["dog","racecar","car"] => ""
 */
public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strings) {
        int index = 0;
        if (strings.length == 0) {
            return "";
        }
        for (int i = 0, length = strings[0].length(); i < length; i++) {
            char s = strings[0].charAt(index);
            for (int j = 0, length1 = strings.length; j < length1; j++) {
                if (strings[j].length() == i || (strings[j].charAt(index) != s)) {
                    return strings[j].substring(0, index);
                }
            }
            index++;
        }
        return strings[0].substring(0, index);
    }

    public static void main(String[] args) {
        String[] strings1 = {"flower", "flow", "flight"};
        String[] strings2 = {"dog", "racecar", "car"};
        String[] strings3 = {};
        System.out.println(longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix(strings2));
        System.out.println(longestCommonPrefix(strings3));
    }
}
