// ==========================================================
// 238. Product of Array Except Self
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 93%)
// Memory     : 72.2 MB (Beats 17%)
// Link       : https://leetcode.com/problems/product-of-array-except-self/
// ==========================================================

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }
        int prev=nums[nums.length-1];
        nums[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            int curr=nums[i];
            nums[i]=prev*nums[i+1];
            prev=curr;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i]*nums[i];
        }

        return ans;
    }
}