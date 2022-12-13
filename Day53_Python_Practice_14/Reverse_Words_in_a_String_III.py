class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split(" ")
        return  " ".join([i[::-1] for i in words])