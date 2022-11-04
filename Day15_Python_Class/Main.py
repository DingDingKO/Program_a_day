import random
import CardFactory
# Day 15:
# Same as Day 3 program but written with Python instead


cards = CardFactory.card_maker()
cards_size = len(cards) - 1


def display(player_number, computer_number):
    if player_number > computer_number:
        print(f"{player_number} is higher than {computer_number}, you win!")
    elif player_number < computer_number:
        print(f"{player_number} is lower than {computer_number}, you lose!")
    else:
        print(f"{player_number} is the same as {computer_number}, you draw!")


def game():
    index_player = random.randint(0, cards_size)
    computer_index = random.randint(0, cards_size)

    player_card = cards[index_player]
    computer_card = cards[computer_index]

    print(f"{player_card.name} vs. {computer_card.name}:")
    print(player_card.__str__())

    while True:

        choice = input("\n Lung capacity (1), Height can jump (2), Probability of winning the lottery (3), "
                   "Susceptibility to the flu (4), Crime fighting potential(5): ")

        if choice == "1":
            return display(player_card.lung_capacity, computer_card.lung_capacity)
        elif choice == "2":
            return display(player_card.height_can_jump, computer_card.height_can_jump)
        elif choice == "3":
            return display(player_card.probability_of_winning_lottery, computer_card.probability_of_winning_lottery)
        elif choice == "4":
            return display(computer_card.susceptibility_to_the_flu, player_card.susceptibility_to_the_flu)
        elif choice == "5":
            return display(player_card.crime_fighting_potential, computer_card.crime_fighting_potential)
        else:
            print("Input not accepted, try again")
            continue



if __name__ == '__main__':
    while True:
        game()
        should_quit = input("type q to quit\n")
        if should_quit == "q":
            break
