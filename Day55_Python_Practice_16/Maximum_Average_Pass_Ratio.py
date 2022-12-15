# Day 55:
# Solution nearly there but the solutions seem to implement a priority queue to speed things up
# which I don't know how to do yet :(
class Solution:

    def frac(self,nums):
        return nums[0]/nums[1]

    def largestDiff(self,nums):
        return (nums[0] + 1)/ (nums[1]+ 1) - nums[0]/nums[1]

    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        for i in range(extraStudents):
            frac_add = list(map(self.largestDiff, classes))
            max_frac_add = max(frac_add)
            max_index = frac_add.index(max_frac_add)
            classes[max_index][0] += 1
            classes[max_index][1] += 1


        return sum(map(self.frac, classes))/len(classes)