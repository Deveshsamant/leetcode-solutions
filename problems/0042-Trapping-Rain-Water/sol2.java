// ==========================================================
// 42. Trapping Rain Water
// Difficulty : Hard
// Language   : Java
// Solution   : #2
// Runtime    : 435 ms (Beats 4%)
// Memory     : 47.8 MB (Beats 43%)
// Link       : https://leetcode.com/problems/trapping-rain-water/
// ==========================================================

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int high1 = 0;

        while (high1 < n - 1) {
            int high2 = -1;
            for (int i = high1 + 1; i < n; i++) {
                if (height[i] >= height[high1]) {
                    high2 = i;
                    break;
                }
            }
            if (high2 == -1) {
                int maxIdx = high1 + 1;
                for (int i = high1 + 2; i < n; i++) {
                    if (height[i] > height[maxIdx]) maxIdx = i;
                }
                high2 = maxIdx;
            }

            total += count(high1, high2, height);
            high1 = high2;
        }
        return total;
    }

    int count(int high1, int high2, int[] nums) {
        int window = high2 - high1 - 1;
        if (window <= 0) return 0;
        int tempcount = window * Math.min(nums[high1], nums[high2]);
        int cc = 0;
        for (int i = high1 + 1; i < high2; i++) {  
            cc += nums[i];
        }
        return tempcount - cc;
    }
}