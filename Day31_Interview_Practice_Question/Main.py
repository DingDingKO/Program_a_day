import math
# Day 31:
# Codility practice question before interview
# It finds the largest amount of consecutive zeros in the binary representation of a number
def solution(N):
    if math.log(N + 1, 2) % 1 == 0 or math.log(N,2) % 1 == 0:
        return 0

    else:
        counts = []

        count = 0
        while N != 0:
            if N % 2 == 0:
                count += 1
            else:
                counts.append(count)
                count = 0

            N = N // 2

    return max(counts)