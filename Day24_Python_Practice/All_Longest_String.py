def solution(inputArray):
    inputArray.sort(key=len, reverse =True)

    index = 0
    maxlen = len(inputArray[0])
    for i in inputArray:
        if len(i) == maxlen:
            index+=1

    return inputArray[:index]