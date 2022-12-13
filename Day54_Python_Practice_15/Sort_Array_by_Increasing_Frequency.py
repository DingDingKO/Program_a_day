class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        hello = list(zip([nums.count(i) for i in nums], nums))

        hello.sort(key=lambda x: (x[0],-x[1]))

        return list(zip(*hello))[1]