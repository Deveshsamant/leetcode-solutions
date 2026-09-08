// ==========================================================
// 485. Max Consecutive Ones
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 59%)
// Memory     : 52.3 MB (Beats 84%)
// Link       : https://leetcode.com/problems/max-consecutive-ones/
// ==========================================================

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}