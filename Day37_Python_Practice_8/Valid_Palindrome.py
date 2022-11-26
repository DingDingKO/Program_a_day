class Solution:
    def isPalindrome(self, s: str) -> bool:

        s_lower = s.lower().strip(' ')
        s_only_letters = "".join ([val for val in s_lower if val.isalpha() or val.isnumeric()])

        return s_only_letters[::-1] == s_only_letters