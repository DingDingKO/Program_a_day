class Solution:
    def longestPalindrome(self, s: str) -> int:
        one_odd = 0

        count = 0
        for i in set(s):
            if s.count(i)%2:
                count+=1


        if count > 0:
            one_odd = 1

        return len(s) + one_odd - count