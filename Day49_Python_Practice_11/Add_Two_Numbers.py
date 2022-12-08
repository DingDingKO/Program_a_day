# Day 49:
# Yay! a Leetcode Medium question!
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry_over = 0
        l1OK = True
        l2OK = True

        hello = hello1 = ListNode(None)

        while l1OK or l2OK:

            if l1OK and l2OK:
                value = l1.val + l2.val + carry_over
            elif l1OK:
                value = l1.val + carry_over
            else:
                value = l2.val + carry_over

            if value > 9:
                value -= 10
                carry_over = 1
            else:
                carry_over = 0

            if hello.val is None:
                hello.val = value
            else:
                hello.next = ListNode(value)
                hello = hello.next

            if l1.next:
                l1 = l1.next
            else:
                l1OK = False

            if l2.next:
                l2 = l2.next
            else:
                l2OK = False

        if carry_over == 1:
            hello.next = ListNode(carry_over)
        return hello1