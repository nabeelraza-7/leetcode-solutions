// You need to create a separate class file with `Solution` name for this to work.

/*
Problem No. 9:
Palindrom Number.
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. 
For example, 121 is palindrome while 123 is not.
LINK: https://leetcode.com/problems/palindrome-number/ 
*/

class Solution {
    public boolean isPalindrome(int x) {
        String s = "" + x;
        return isPalindrome(s);
    }
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return true;
        if (s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        } else{
            return false;
        }
        
    }
}