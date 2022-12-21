class Solution:
    def printVertically(self, s: str) -> List[str]:
        words = s.split(" ")
        max_length = max(map(lambda x: len(x), words))

        output =[""]*max_length

        for word in words:
            for i in range(max_length):
                if i < len(word):
                    output[i] += word[i]
                else:
                    output[i] += " "

        return [i.rstrip(" ")for i in output]