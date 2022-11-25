class Solution:

    def checkOppositeSides(self,lSide, rSide):
        if not lSide and not rSide:
            return True

        elif not lSide or not rSide:
            return False

        elif lSide.val == rSide.val:
            return self.checkOppositeSides(lSide.left, rSide.right) and self.checkOppositeSides(lSide.right, rSide.left)


    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.checkOppositeSides(root.left, root.right)
        