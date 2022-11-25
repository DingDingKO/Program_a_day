class Solution:
    def one_or_cycle(self,original_n, value):

        digits = list(str(value))
        value = sum([int(digit)**2 for digit in digits])

        if value == 1:
            return True
        elif value == original_n:
            return False
        else:
            return self.one_or_cycle(original_n, value)

    def isHappy(self, n: int) -> bool:
        return self.one_or_cycle(n, n)

if __name__ == '__main__':
    solution = Solution()
    solution.isHappy(53)
