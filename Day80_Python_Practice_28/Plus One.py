class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        if digits[-1] < 9:
            digits[-1] +=1

        else:
            i = -1
            while digits[i] == 9:

                digits[i] = 0

                if len(digits) == -i:
                    return [1] + digits


                if digits[i-1] == 9:
                    i-=1
                    continue

                else:
                    digits[i-1] += 1
                    return digits


        return digits
