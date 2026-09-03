// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 99%)
// Memory     : 47.3 MB (Beats 24%)
// Link       : https://leetcode.com/problems/two-sum/
// ==========================================================

            int x=target-nums[i];
            if(aa.containsKey(x)){
                return new int[]{i,aa.get(x)};
            }
            else{
                aa.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
