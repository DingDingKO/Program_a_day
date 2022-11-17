def solution(inputArray, elemToReplace, substitutionElem):
    temp = []

    for i in inputArray:
        if i == elemToReplace:
            temp.append(substitutionElem)
        else:
            temp.append(i)

    return temp