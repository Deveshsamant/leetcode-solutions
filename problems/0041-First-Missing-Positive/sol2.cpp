// ==========================================================
// 41. First Missing Positive
// Difficulty : Hard
// Language   : C++
// Solution   : #2
// Runtime    : 111 ms (Beats 5%)
// Memory     : 84.5 MB (Beats 5%)
// Link       : https://leetcode.com/problems/first-missing-positive/
// ==========================================================

        x.insert(x.end(), y.begin(), y.end());
        if(x.size()==0) return 1;
        if(x.size()<2 && x[0]!=1) return 1; 
        int len=x[x.size()-1];
        for(int i=1;i<len;i++){
            if(i!=x[i-1]){
                return i;
            }
        }
        return x[x.size()-1]+1;
    }
};