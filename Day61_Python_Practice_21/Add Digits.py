class Solution:
    def addDigits(self, num: int) -> int:
        tot =0
        for i in str(num):
            tot += int(i)
        if tot > 9:
            return self.addDigits(tot)
        else:
            return tot