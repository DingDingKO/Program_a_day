class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        t_index = 0
        for letter in s:
            if letter in t[t_index:]:
                t_index += t[t_index:].index(letter) + 1
            else:
                return False
        return True