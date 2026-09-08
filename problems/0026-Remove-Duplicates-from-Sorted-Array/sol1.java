// ==========================================================
// 26. Remove Duplicates from Sorted Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 10 ms (Beats 3%)
// Memory     : 47.5 MB (Beats 9%)
// Link       : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// ==========================================================

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            boolean gg=true;
            while(gg){
                if(j<nums.length && nums[j]==nums[i]){
                    nums[j]=101;
                    j++;
                }
                else{
                    i=j;
                    gg=false;
                }
            }

        }
        Arrays.sort(nums);
        int count=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==101){
                break;
            }
            count++;
        }
        return count;
    }
}