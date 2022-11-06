import collections
import random
# Day 16:

# A game where you can get a new card or the last card facing down by using a deque

# Picking up a new face down card can be thought of as taking a card from one end of a deque, whilst picking up the
# last card to be put down can be thought of as taking a card from the other end of the deque.

# I just thought deques would be a cool thing to look at in my brief Python holiday away from Java (although I think
# Java has them as well)

number_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
random.shuffle(number_list)

deck = collections.deque(number_list)

hand1 = []
hand2 = []

target = random.randint(10, 30)
print(f"Your target score is {target}")


def play(hand, deck):
    print(hand)
    last_or_new = input(f"Last Card: {deck[0]}, lc or nc?")
    if last_or_new == "lc":
        hand.append(deck.popleft())
    elif last_or_new == "nc":
        hand.append(deck.pop())

    while len(hand) > 3:
        print(hand)
        index_to_remove = int(input("Remove 1, 2, 3, or 4:"))
        deck.appendleft(hand[index_to_remove - 1])
        hand.pop(index_to_remove - 1)

    return hand, deck


for round in range(7):
    print("\nPlayer 1:")
    hand1, deck = play(hand1, deck)

    print("\nPlayer 2:")
    hand2, deck = play(hand2, deck)


player1_score = sum(hand1)
player2_score = sum(hand2)

player1_diff = abs(target - player1_score)
player2_diff = abs(target - player2_score)

closest = min(player1_diff, player2_diff)

if player1_score == player2_score:
    print(f"\nIt's a tie! You both got {player1_score}")

elif closest == player1_diff:
    print("\nPlayer 1 wins!")

else:
    print("\nPlayer 2 wins!")
