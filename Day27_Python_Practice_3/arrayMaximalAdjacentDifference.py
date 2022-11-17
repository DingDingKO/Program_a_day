def solution(inputArray):
    last = inputArray[0]
    diff = []

    for i in inputArray:
        diff.append(abs(i - last))
        last = i
    return max(diff)