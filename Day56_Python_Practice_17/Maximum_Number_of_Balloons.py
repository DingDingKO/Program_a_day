class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        balloon_letters = ["b", "a", "l","o", "n"]

        min_count = 99999
        for i in balloon_letters:
            if i in text:
                count = text.count(i)
                print (count,i)
                if i == "l" or i == "o":
                    count = count//2

                if count < min_count:
                    min_count = count
            else:
                return 0

        return min_count