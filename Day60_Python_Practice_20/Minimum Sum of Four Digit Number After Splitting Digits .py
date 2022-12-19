class Solution:
    def minimumSum(self, num: int) -> int:
        nums = [(num//10**i) %10 for i in range(0,4)]
        nums.sort()

        return (nums[0] + nums[1]) * 10 + nums[2] + nums[3]