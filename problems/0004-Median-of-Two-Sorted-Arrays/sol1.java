// ==========================================================
// 4. Median of Two Sorted Arrays
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 49.1 MB (Beats 16%)
// Link       : https://leetcode.com/problems/median-of-two-sorted-arrays/
// ==========================================================

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l = 0;
        int r = 0;

        int total = nums1.length + nums2.length;
        int mid = total / 2;

        int prev = 0;
        int curr = 0;

        for (int i = 0; i <= mid; i++) {

            prev = curr;

            if (l < nums1.length && r < nums2.length) {
                if (nums1[l] <= nums2[r]) {
                    curr = nums1[l++];
                } else {
                    curr = nums2[r++];
                }
            } 
            else if (l < nums1.length) {
                curr = nums1[l++];
            } 
            else {
                curr = nums2[r++];
            }
        }

        if (total % 2 == 1) {
            return curr;
        }

        return (prev + curr) / 2.0;
    }
}