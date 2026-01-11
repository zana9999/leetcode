/*
 * @lc app=leetcode id=1200 lang=java
 *
 * [1200] Minimum Absolute Difference
 */

// @lc code=start

import java.util.Arrays;
import java.util.List;
import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        
        int min = Integer.MAX_VALUE;;
        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, arr[i] - arr[i-1]);
            set.add(arr[i]);
        }

        List<List<Integer>> list = new ArrayList<>();
                for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i] + min)){
                list.add(new ArrayList<>(List.of(arr[i], arr[i]+min)));

            }
        

            
        }

        return list;
    }
}
// @lc code=end

