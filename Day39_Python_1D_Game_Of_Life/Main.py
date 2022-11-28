def patterner(pattern, days):
    if days == 0:
        return pattern
    temp = []

    for i in range(1, len(pattern) - 1):
        if pattern[i - 1] == pattern[i + 1]:
            temp.append(0)
        else:
            temp.append(1)

    print([0] + temp + [0])
    return patterner([0] + temp + [0], days - 1)

# Dead if two neighbours have the same value
patterner([1,0,0,1,1,0,1,1], 2)