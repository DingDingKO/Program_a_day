def solution(score1, score2):
    max_score = max(score1, score2)

    if abs(score1 - score2) > 1 and max_score == 6 or max_score == 7 and 7 > min(score1, score2) >= 5:
        return True
    else:
        return False