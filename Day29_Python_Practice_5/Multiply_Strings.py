class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        digits = {"0":0, "1":1,"2":2,"3":3,"4":4,"5":5,"6":6,"7":7,"8":8,"9":9}


        n1 = 0
        n2 = 0

        length1 = len(num1)
        for i in reversed(range(0, length1)):
            n1 += digits[num1[i]] * 10**(length1 - 1 - i)


        length2 = len(num2)
        for i in reversed(range(0, length2)):
            n2 += digits[num2[i]] * 10**(length2 - 1 - i)

        return str(n1 * n2)