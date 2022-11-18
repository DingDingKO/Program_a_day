class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:

        while head:
            if head.val == 10001:
                return True
            else:
                head.val = 10001
                head = head.next
        return False