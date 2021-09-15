""" 
Problem no. 12:
Integer to Roman.
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
LINK: https://leetcode.com/problems/integer-to-roman/
"""

class Solution:
    def intToRoman(self, num: int) -> str:
        digits = []
        while num >= 10:
            digits.insert(0, num%10)
            num = num//10
        digits.insert(0, num)
        print(digits)
        ones = ['I', 'X', 'C', 'M']
        fours = ['IV', 'XL', 'CD']
        fives = ['V', 'L', 'D']
        nines = ['IX', 'XC', 'CM']
        ans = ""
        count = len(digits) - 1
        for d in digits:
            if d < 4:
                ans += ones[count]*d
            elif d == 4:
                ans += fours[count]
            if d >= 5 and d < 9:
                ans += fives[count] + ones[count]*(d-5)
            elif d == 9:
                ans += nines[count]
            count -= 1
        return ans