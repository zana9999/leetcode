/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.Arrays;
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length == 1){
            return intervals;
        }
        
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);

        int[] prevEnd = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            if(prevEnd[1] >= intervals[i][0]){
                prevEnd[1] = Math.max(prevEnd[1], intervals[i][1]); 

            } else{
                result.add(prevEnd);
                prevEnd = intervals[i];
            }
        }

        result.add(prevEnd); 

        return result.toArray(new int[result.size()][]);
    }
}