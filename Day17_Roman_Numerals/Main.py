# Day 17:
# A program which calculates the number a Roman Numeral represents

numerals = ['M', 'D', 'C', 'L', 'X', 'V', 'I']
numbers = [1000, 500, 100, 50, 10, 5, 1]


def numeral_to_number(roman_numeral):
    roman_numeral_list = list(roman_numeral)
    total = 0
    roman_numeral_length = len(roman_numeral_list)

    for i in range(roman_numeral_length):
        numeral_index = numerals.index(roman_numeral_list[i])
        number = numbers[numeral_index]

        if i == (roman_numeral_length - 1) or numeral_index <= numerals.index(roman_numeral_list[i + 1]):
            total += number
        else:
            total -= number

    return total


roman_numeral = input("Enter Numeral:")
print(numeral_to_number(roman_numeral))
