// ==========================================================
// 118. Pascal's Triangle
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 95%)
// Memory     : 43.5 MB (Beats 34%)
// Link       : https://leetcode.com/problems/pascals-triangle/
// ==========================================================

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int x=0;
        while(x<numRows){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<=x;i++){
                temp.add(combination(x,i));
            }
            ans.add(temp);
            x++;
        }
        return ans;
    }
    int combination(int u,int l){
        if(u-l<l){
            l=u-l;
        }
        //lower
        long lower=1;
        for(int i=1;i<=l;i++){
            lower*=i;
        }
        long upper=1;
        while(l!=0){
            upper*=u;
            u--;
            l--;
        }
        return (int)(upper/lower);
        
    }
}