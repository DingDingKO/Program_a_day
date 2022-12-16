import heapq

data = [1, 2, 11, 4, 4, 1, 2, 7, 3, 8, 9]
heapq.heapify(data)

print(data)

# at i, child at 2*i+1, 2*i+2, parent node at (i-1)/2
# [1, 2, 1, 3, 4, 11, 2, 7, 4, 8, 9]
#                 1
#              /     \
#             2       1
#           /  \     /  \
#          3    4   11   2
#         /\    /\
#        7  4   8 9

for i in range(len(data)):
    print(heapq.heappop(data))
    print(data)

# Min heap - lowest value always at root node
# Right most node replaces root
# parent/child swaps until stable - all parents lower than children

# [1, 2, 2, 3, 4, 11, 9, 7, 4, 8]
#                 1
#              /     \
#             2       2
#           /  \     /  \
#          3    4   11   9
#         /\    /
#        7  4   8

# [2, 2, 8, 3, 4, 11, 9, 7, 4]
#                 2
#              /     \
#             2       8
#           /  \     /  \
#          3    4   11   9
#         /\
#        7  4

# [2, 3, 8, 4, 4, 11, 9, 7]
#                 2
#              /     \
#             3       8
#           /  \     /  \
#          4    4   11   9
#         /
#        7

# [3, 4, 8, 4, 7, 11, 9]
#                 3
#              /     \
#             4       8
#           /  \     /  \
#          4    7   11   9

# [4, 4, 8, 9, 7, 11]
#                 4
#              /     \
#             4       8
#           /  \     /
#          9    7   11

# [4, 7, 8, 9, 11]
#                 4
#              /     \
#             7      8
#           /   \
#          9     11

# [7, 9, 8, 11]
#                 7
#              /     \
#             9       8
#           /
#          11

# [8, 9, 11]
#                8
#              /
#             9
#           /
#          11

# [9, 11]
#             9
#           /
#          11

# [11]
#          11
