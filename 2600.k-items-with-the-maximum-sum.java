/*
 * @lc app=leetcode id=2600 lang=java
 *
 * [2600] K Items With the Maximum Sum
 */

// @lc code=start
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        if(k < numOnes){
            return k;
        } else {
            k -= numOnes; 
            sum += numOnes; 
            if(!(k <= 0)){
                k -= numZeros; 
            }
            if(!(k <= 0)){
                int ans = k*-1; 
                sum += ans; 
            }
        }

        return sum;

    }
}
// @lc code=end


// {1, 1, 1, 1, 1, 1
// 0, 0, 0, 0, -1}