# Day 25:
# Some more practice questions on CodeSignal

def parseString(stringList):
    if stringList[0].__contains__("Same"):
        return 1
    else:
        if stringList[1].__contains__("higher"):
            return 1 + float(stringList[0])/100
        else:
            return 1 - float(stringList[0])/100






def solution(prices, notes, x):
    multiplier = [i.split("%") for i in notes]
    total = round(sum([prices[i] - prices[i]/(parseString(multiplier[i]))  for i in range(len(multiplier))]),5)
    return total <= x


