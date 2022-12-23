class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        height_and_name = list(zip(heights, names))
        height_and_name.sort(reverse=True)
        return list(zip(*height_and_name))[1]