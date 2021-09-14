// You need to create a separate class file with `Solution` name for this to work.

/*
Problem No. 1:
Two Sum.
Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
LINK: https://leetcode.com/problems/two-sum/ 
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            for(int j=i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] result = {i, j};
                    return result;
                }
            } continue;
        }
        return null;
    }
}