class Solution:
    def balancedStringSplit(self, s: str) -> int:
        balanced_strings = 0
        Ls = 0

        for letter in s:
            if letter == "L":
                Ls += 1
            else:
                Ls -= 1

            if Ls == 0:
                balanced_strings += 1

        return balanced_strings
