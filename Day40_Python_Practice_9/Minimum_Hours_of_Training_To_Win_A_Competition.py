class Solution:
    def minNumberOfHours(self, initialEnergy: int, initialExperience: int, energy: List[int], experience: List[int]) -> int:

        energy_needed = sum(energy) - initialEnergy + 1

        if energy_needed < 0:
            energy_needed = 0

        experience_gained = 0
        experience_needed_at_each_stage = []

        for i in range(len(experience)):
            experience_needed_at_each_stage.append(experience[i] - experience_gained)
            experience_gained += experience[i]

        experienceNeeded = max(experience_needed_at_each_stage)  - initialExperience + 1

        if experienceNeeded < 0:
            experienceNeeded = 0

        return energy_needed + experienceNeeded