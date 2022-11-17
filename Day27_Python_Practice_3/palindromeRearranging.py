def solution(inputString):
    unique_letters = set(inputString)

    is_even_letter_counts = [inputString.count(letter) % 2 == 0 for letter in unique_letters]

    return sum(is_even_letter_counts) >= len(unique_letters) - 1