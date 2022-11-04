import Card
import random


def card_maker():
    # Used the program I made in Day 4 to get all the names into the list
    names = ["Danilo Montes", "Petra Hatfield", "Neva Velez", "Michelle Mahoney", "Jame Bowman", "Ike Krueger",
             "Dolores Lucero", "Josh Nielsen", "Johnathan Hutchinson", "Donn Dalton", "Horacio Russo",
             "Garret Stevenson", "Royal Ray", "Wes Riggs", "Augustus Grant", "Maurice Ellis", "Sarah Ferguson",
             "Mariano Ho", "Fern Mays", "Matilda Harris", "Lisa Acosta", "Harley Harmon", "Coleen Franklin",
             "Sebastian Steele", "Burt Berger", "Madelyn Bryan", "Samuel Cortez", "Gwen Mclean", "Sung Rasmussen",
             "Jody Mcmillan", "Hester Simpson", "Tommie Ward", "Karla Cox", "Chester Owens", "Ingrid Rios",
             "Tisha Quinn", "Evangelina Church", "Issac Santos", "Frances Hodges", "Alyce Garza", "Bryant Sanders",
             "Corey Case", "Priscilla Jensen", "Becky Johns", "Mitzi Roth", "Sherman Alexander", "Wilbert Crane",
             "Rosa Gardner", "Frieda Rollins", "Lindsay Tapia"]
    deck = []
    for name in names:
        deck.append(
            Card.Card(name, round(random.random() * 2, 2), round(random.random() * 5, 2), random.randint(0, 100),
                      random.randint(0, 100), random.randint(0, 1000)))

    return deck
