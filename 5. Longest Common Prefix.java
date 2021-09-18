//
/* 
Problem 14:
Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
LINK: https://leetcode.com/problems/longest-common-prefix/
*/

class Solution {
    // public String longestCommonPrefix(String[] strs) {
    //     if (strs.length == 0) return "";
    //     String prefix = "";
    //     // find minimum
    //     int minLength = strs[0].length();
    //     for (int i = 1; i < strs.length; i++) {
    //         if (strs[i].length() < minLength){
    //             minLength = strs[i].length();
    //         }
    //     }
    //     for (int i = 0; i < minLength; i++) {
    //         char current = strs[0].charAt(i);
    //         for (String s : strs) {
    //             if (s.charAt(i) == current) {
    //                 continue;
    //             } else {
    //                 return prefix;
    //             }
    //         }
    //         prefix += "" + current;
    //     }
    //     return prefix;
    // }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        if (strs.length == 2) {
            return baseCase(strs);
        }
        if (strs.length > 2) {
            int mid = (int) strs.length / 2;
            // 0: mid --- mid+1: last
            String[] left = Arrays.copyOfRange(strs, 0, mid);
            String[] right = Arrays.copyOfRange(strs, mid, strs.length);
            return longestCommonPrefix(new String[] { longestCommonPrefix(left), longestCommonPrefix(right) });
        }
        return null;
    }

    private String baseCase(String[] strs) {
        String prefix = "";
        int min = (strs[0].length() < strs[1].length()) ? strs[0].length() : strs[1].length();
        for (int i = 0; i < min; i++) {
            if (strs[0].charAt(i) == strs[1].charAt(i)) {
                prefix += "" + strs[0].charAt(i);
            } else {
                return prefix;
            }
        }
        return prefix;
    }
}