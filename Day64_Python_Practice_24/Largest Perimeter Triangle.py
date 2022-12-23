class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort(reverse = True)
        i = 0

        while i + 2 < len(nums):
            a,b,c = nums[i:i+3]
            if a < b + c:
                return a + b + c
            i+=1
        return 0