def solution(a, b):

    containsTheSame = sorted(a) == sorted(b)
    amountOfSwaps = sum([i[0] != i[1] for i in zip(a, b)]) <= 2

    return containsTheSame and amountOfSwaps