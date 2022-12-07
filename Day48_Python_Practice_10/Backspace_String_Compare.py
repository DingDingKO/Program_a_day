class Solution(object):
    def backspaceCompare(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        stackS= []
        stackT = []

        for i in list(s):
            if not i == '#':
                stackS.append(i)
            elif len(stackS) > 0:
                stackS.pop()

        for i in list(t):
            if not i == '#':
                stackT.append(i)
            elif len(stackT)>0:
                stackT.pop()
        return stackS == stackT


hello = Solution()

print(hello.backspaceCompare("a#c", "b"))