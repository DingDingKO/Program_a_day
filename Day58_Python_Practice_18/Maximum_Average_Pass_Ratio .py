# Day 58:
# Yay! I finally got round to re-doing the problem now that I know how to do heaps
import heapq
class Solution:
    def calcDiff(self, n, d):
        return (n + 1)/(d + 1) - n/d

    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        heap = []

        for numerator, denominator in classes:
            diff = self.calcDiff(numerator, denominator)
            heapq.heappush(heap,(-diff, numerator, denominator))

        for i in range(extraStudents):
            most_improvement = heapq.heappop(heap)
            diff, numerator, denominator = most_improvement

            numerator += 1
            denominator +=1

            diff = self.calcDiff(numerator, denominator)
            heapq.heappush(heap,(-diff,numerator, denominator))

        tot = 0
        for i in heap:
            tot += i[1]/i[2]

        return tot/len(heap)