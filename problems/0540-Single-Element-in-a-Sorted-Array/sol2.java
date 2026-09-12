// ==========================================================
// 540. Single Element in a Sorted Array
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 53 MB (Beats 22%)
// Link       : https://leetcode.com/problems/single-element-in-a-sorted-array/
// ==========================================================

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if (mid % 2 == 1) mid--;  
            if(nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else{
                r=mid;
            }
            
        }
        return nums[l];
    }
}