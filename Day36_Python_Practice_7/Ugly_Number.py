class Solution:
    def isUgly(self, n: int) -> bool:
        temp = n


        if not n%2:
            n = n/2
        if not n%3:
            n = n/3
        if not n%5:
            n = n/5

        if n == 1:
            return True
        elif n == temp:
            return False


        else:
            return self.isUgly(n)
if __name__ == '__main__':
    solution = Solution()
    print(solution.isUgly(7))