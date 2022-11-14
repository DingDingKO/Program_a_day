def solution(inputArray):
    total = 0
    for i in inputArray:
        if i == 0:
            return total
        else:
            total += i