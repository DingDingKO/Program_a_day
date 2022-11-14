def solution(young, beautiful, loved):
    if ((young and beautiful) and not loved) or (loved and not (beautiful and young)):
        return True
    else:
        return False

