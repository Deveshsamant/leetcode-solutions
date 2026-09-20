// ==========================================================
// 41. First Missing Positive
// Difficulty : Hard
// Language   : C++
// Solution   : #6
// Runtime    : 97 ms (Beats 5%)
// Memory     : 84.5 MB (Beats 5%)
// Link       : https://leetcode.com/problems/first-missing-positive/
// ==========================================================

class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        vector<int> x;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0){
                x.push_back(nums[i]);
            }
        }
        sort(x.begin(),x.end());
        set<int> y;
        y.insert(x.begin(),x.end());
        x.clear();
        x.insert(x.end(), y.begin(), y.end());
        if(x.size()==0) return 1;
        if(x.size()<2 && x[0]!=1) return 1; 
        int len=x[x.size()-1];
        for(int i=1;i<len;i++){
            if(i!=x[i-1]){
                return i;
            }
        }
        return x[x.size()-1]+1;
    }
};