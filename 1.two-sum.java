/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> set = new HashMap<>();
    
        for(int i = 0; i < nums.length; i++){
            if(set.containsKey(target - nums[i])){
                return new int[] {set.get(target-nums[i]), i};
            } else {
                set.put(nums[i], i);
            }
        }

        return new int [] {0,0};
    }
}
// @lc code=end

