#34. Find First and Last Position of Element in Sorted Array
# Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

# Your algorithm's runtime complexity must be in the order of O(log n).

# If the target is not found in the array, return [-1, -1].

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        print(nums)
        if target in nums:
            x=nums.index(target) 
            y=len(nums)-1-nums[::-1].index(target) 
        else:
            x=-1
            y=-1
        return([x,y])