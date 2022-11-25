import math
class Solution:
    def checkPerfectNumber(self, num: int) -> bool:

        if num == 1:
            return False

        range_up_to = int(math.sqrt(num)) + 1

        total = 0

        for i in range(1,range_up_to):
            if not num%i:
                total += i + num/i


        return total/2 == num