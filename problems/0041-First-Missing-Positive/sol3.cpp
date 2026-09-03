// ==========================================================
// 41. First Missing Positive
// Difficulty : Hard
// Language   : C++
// Solution   : #3
// Runtime    : 115 ms (Beats 5%)
// Memory     : 84.5 MB (Beats 5%)
// Link       : https://leetcode.com/problems/first-missing-positive/
// ==========================================================

class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        vector<int> x;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0){
                x.push_back(nums[i]);
            }
        }
        sort(x.begin(),x.end());
        set<int> y;
        y.insert(x.begin(),x.end());
        x.clear();