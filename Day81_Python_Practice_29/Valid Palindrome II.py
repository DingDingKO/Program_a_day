class Solution:
    def validPalindrome(self, s: str) -> bool:

        head = 0
        tail = len(s) - 1

        while head < tail:
            if s[head] != s[tail]:
                removedLeftSide = s[head+1:tail+1]
                removedRightSide = s[head:tail]


                return removedLeftSide == removedLeftSide[::-1] or removedRightSide == removedRightSide[::-1]



            tail -= 1
            head += 1

        return True
