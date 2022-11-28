import random

alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z"]


def caesar_shift():
    random_shift = random.randint(0, len(alphabet))
    alphabet_shift = alphabet[random_shift:] + alphabet[:random_shift]
    return dict(zip(alphabet, alphabet_shift))


def random_assign():
    alphabet_shift = alphabet.copy()
    random.shuffle(alphabet_shift)
    return dict(zip(alphabet, alphabet_shift))


def apply_cypher(l):
    global cypher_dict
    return cypher_dict[l]


cypher_dict = caesar_shift()
input_word = input("Enter a word:")
print("".join(map(apply_cypher, input_word)))

cypher_dict = random_assign()
input_word = input("Enter a word:")
print("".join(map(apply_cypher, input_word)))
