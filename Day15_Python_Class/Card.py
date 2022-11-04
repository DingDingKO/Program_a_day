class Card:
    def __init__(self, name, lung_capacity, height_can_jump, probability_of_winning_lottery, susceptibility_to_the_flu,
                 crime_fighting_potential):
        self.crime_fighting_potential = crime_fighting_potential
        self.susceptibility_to_the_flu = susceptibility_to_the_flu
        self.probability_of_winning_lottery = probability_of_winning_lottery
        self.height_can_jump = height_can_jump
        self.lung_capacity = lung_capacity
        self.name = name

    def __getattr__(self, item):
        return self.item

    def __str__(self):
        return f"Name: {self.name}, Lung capacity: {self.lung_capacity} L, Height can jump: {self.height_can_jump} m, " \
               f"Probability of winning the lottery: {self.probability_of_winning_lottery}%, " \
               f"Susceptibility to the flu (lowest wins): {self.susceptibility_to_the_flu}, " \
               f"Crime fighting potential: {self.crime_fighting_potential}"
