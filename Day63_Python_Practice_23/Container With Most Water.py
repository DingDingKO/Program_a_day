class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        L = 0
        R = len(height) - 1

        while L != R:
            area = min(height[R], height[L]) * (R - L)
            if area > max_area:
                max_area = area

            if height[L] > height[R]:
                # Since the area is based on the min height - look for values for height from the one
                # that has more potential to increase
                R -= 1
            else:
                L += 1

        return max_area
