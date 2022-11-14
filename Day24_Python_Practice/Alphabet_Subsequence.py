def solution(s):
    unicode_val = [ord(c) for c in s]

    for i in range(0, len(unicode_val) - 1):
        if not unicode_val[i] < unicode_val[i +1]:
            return False
    return True
