/*
 * @lc app=leetcode id=2602 lang=java
 *
 * [2602] Minimum Operations to Make All Array Elements Equal
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        
        List<Long> res = new ArrayList<>();
        int m = 0;
        long sum = 0;
        while(m < queries.length){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != queries[m]){
                    if(queries[m] < nums[i]){
                        sum +=nums[i]-queries[m];
                    } else {
                        sum +=queries[m]-nums[i];
                    }
                }
            }
            res.add(sum);
            sum = 0;
            m++;
        }   

        return res;

    }
}
// @lc code=end

