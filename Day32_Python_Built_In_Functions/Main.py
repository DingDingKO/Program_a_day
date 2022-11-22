# https://docs.python.org/3/library/functions.html#aiter
# Day 32:
# A look at some if the useful Built-in functions in Python
# Out of all the ones I didn't know, eval seems the coolest

import math

print("\n abs: ")
print(abs(-6))

print("\n all: ")
print(all([True, False, True]))

print("\n any: ")
print(any([True, False, True]))

print("\n bin: ")
print(bin(163))

print("\n bool: ")
print(bool(None))
print(bool(0))
print(bool(''))
print(bool(1))
print(bool('hello'))

print("\n complex: ")
print(complex(2, -5))

print("\n dir: ")
print(dir(math))

print("\n divmod: ")
print(divmod(67, 7))  # 7 * 9 + 4 = 67

print("\n enumerate: ")
print(list(enumerate(["hello", "my", "name", "is", "mathew"])))
print(enumerate(["hello", "my", "name", "is", "mathew"]).__next__())

print("\n eval: ")
h = 3
e = 4
l = 2
o = 8

print(eval("h + e + l * l * o + 5"))
print(eval("6 + 9/4"))

print("\n filter: ")


def even(n):
    return n % 2


print(list(filter(even, [1, 2, 3, 4, 5])))  # Filters if true

print("\n float: ")
print(float('-Infinity'))

print("\n format: ")
print(format(200000, ","))

print("\n help: ")
print(help(round))

print("\n hex: ")
print(hex(271))

print("\n int: ")
print(int("0"))

print("\n len: ")
print(len({"Bob": 5, "Charlie": 7, "Danielle": 9}))

print("\n map: ")


def add_three_times_five(n):
    return (n + 3) * 5


print(list(map(add_three_times_five, [1, 5, 788, 32, 29992])))

print("\n max: ")
print(max(1, 7, 4, -9))

print("\n min: ")
print(min(1, 7, 4, -9))

print("\n iter/next: ")
iterable_list = iter([3, 32, 58, 9])
print(next(iterable_list))
print(next(iterable_list))

print("\n oct: ")
print(oct(6489))

print("\n ord: ")
print(ord("*"))

print("\n chr: ")
print(chr(42))

print("\n pow: ")
print(pow(2, 10))

print("\n print: ")
print("hello my name is mathew", "how are you?", sep=" :) ", end='.')
print("hello my name is mathew")

print("\n reversed: ")
print(list(reversed([1, 2, 3, 4, 5, 6, 7, 8, 9])))

print("\n round: ")
print(round(5.975464, 3))

print("\n set: ")
print(set([1, 3, 5, 5, 4, 233442, 22, 11, 1, 2, 23]))

print("\n slice: ")
sentence = "hello my name is mathew and I like Giraffes"
string_slice = slice(1, len(sentence), 2)

print(sentence)
print(sentence[string_slice])

print("\n sorted: ")
print(sorted([4, 6, 8, 4, 2, 34, 67, 223, 1]))
print(sorted(['a', 'c', 'g', 'z'], reverse=True))

print("\n str: ")
print(str(8))

print("\n sum: ")
print(sum([4, 6, 3, 23, 8]))

print("\n type: ")
print(type(5))
print(type("hello"))
print(type([]))

print("\n zip: ")
print(list(zip([1, 2, 3, 4, 5, 6, 7], [54, 32, 54145, 767, 36738, 878])))

print("\n input: ")
print(input("hello?"))
