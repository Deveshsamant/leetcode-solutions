// ==========================================================
// 31. Next Permutation
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 6%)
// Memory     : 44.2 MB (Beats 96%)
// Link       : https://leetcode.com/problems/next-permutation/
// ==========================================================

class Solution {
    public void nextPermutation(int[] nums) {
         int breakint=nums.length-1;
         boolean sorteddesc=true;
         //finding break point
         for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                breakint=i-1;
                sorteddesc=false;
                break;
            }
         }

         if(sorteddesc){
            Arrays.sort(nums);
            return;
         }
         //if nums.length-1-breakint 

        int j = nums.length - 1;
        while (nums[j] <= nums[breakint]) {
            j--;
        }

        int temp = nums[breakint];
        nums[breakint] = nums[j];
        nums[j] = temp;


         revv(nums,breakint+1,nums.length-1);
    }

    void revv(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}