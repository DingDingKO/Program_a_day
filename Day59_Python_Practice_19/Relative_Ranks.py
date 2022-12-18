import heapq
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        score_length = len(score)
        score_with_index = [(-score[i], i) for i in range(score_length)]
        heapq.heapify(score_with_index)

        medals = ["Gold Medal", "Silver Medal", "Bronze Medal"]

        for i in range(score_length):
            value, index = heapq.heappop(score_with_index)
            if i < 3:
                score[index] = medals[i]
            else:
                score[index] = str(i + 1)
        return score
