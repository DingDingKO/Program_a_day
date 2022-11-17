def solution(n):
    return all([int(number) % 2 == 0 for number in str(n)])