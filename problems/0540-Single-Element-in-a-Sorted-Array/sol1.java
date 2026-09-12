// ==========================================================
// 540. Single Element in a Sorted Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 25%)
// Memory     : 52.8 MB (Beats 58%)
// Link       : https://leetcode.com/problems/single-element-in-a-sorted-array/
// ==========================================================

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
    }
}