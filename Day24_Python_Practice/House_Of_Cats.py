def solution(legs):
    if legs % 4 == 2:
        print (legs)
        return [i for i in range(1,int(legs/2)+1,2)]
    else:
        return [i for i in range(0,int(legs/2)+1,2)]

