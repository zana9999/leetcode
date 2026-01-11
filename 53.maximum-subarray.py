#
# @lc app=leetcode id=53 lang=python3
#
# [53] Maximum Subarray
#

# @lc code=start
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sub = max_sub = nums[0]
        for num in nums[1:]:
            curr_sub = max(curr_sub + num, num)
            max_sub = max(max_sub, curr_sub)
        return max_sub
# @lc code=end
        