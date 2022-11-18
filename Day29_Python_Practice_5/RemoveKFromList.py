# Singly-linked lists are already defined with this interface:
# class ListNode(object):
#   def __init__(self, x):
#     self.value = x
#     self.next = None
#

def solution(l, k):
    # Makes a copy so that l still at start but not a complete copy so changes affect l
    current = l

    while current:
        # If there is a next value and if it's equal to k
        if current.next and current.next.value == k:
            # Skip over the pointer of the node equal to k
            current.next = current.next.next
        else:
            current = current.next

    # Only need to return first node. If first node equals k, return the second node, otherwise, return the first node
    if l and l.value == k:
        return l.next
    else:
        return l


