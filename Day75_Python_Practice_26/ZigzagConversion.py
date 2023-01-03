class Solution:
    def convert(self, s: str, numRows: int) -> str:

        modFactor = 2*numRows-2

        if(numRows == 1):
            return s

        hello = [(min(modFactor - i%modFactor, i % modFactor), s[i])for i in range(len(s))]
        hello.sort(key=lambda x: x[0])

        return "".join(list(zip(*hello))[1])