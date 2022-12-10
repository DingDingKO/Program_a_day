class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        if len(set(nums)) == len(nums):
            return False

        offset = k + 1

        for i in range(len(nums)):
            if nums[i] in nums[i + 1: i + offset]:
                return True

        return False