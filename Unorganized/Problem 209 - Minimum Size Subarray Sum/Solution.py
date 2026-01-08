from typing import List

class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:

        if target in nums:
            return 1

        left = 0
        right = 0
        curr_sum = 0
        minLen = float('inf')

        
        for right in range(len(nums)):
            curr_sum += nums[right]
            while curr_sum >= target:
                minLen = min(minLen, right-left+1)
                curr_sum -= nums[left]
                left+=1

        return 0 if minLen == float('inf') else minLen

