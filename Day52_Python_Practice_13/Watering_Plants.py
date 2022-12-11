class Solution:
    def wateringPlants(self, plants: List[int], capacity: int) -> int:
        length_of_plants = len(plants)
        total_step_count = 0
        local_capacity = capacity


        for i in range(length_of_plants-1):
            if local_capacity - plants[i] < plants[i + 1]:
                total_step_count += 2 * i + 2
                local_capacity = capacity
            else:
                local_capacity -= plants[i]

        return total_step_count + length_of_plants