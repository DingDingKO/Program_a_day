# Day 24:
# Some Python questions from CodeSignal

def solution(picture):
    size = len(picture[0]) + 2
    temp = []

    temp.append("*"*size)

    for i in picture:
        temp.append("*"+i+"*")

    temp.append("*"*size)

    return temp

