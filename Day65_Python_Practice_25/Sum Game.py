class Solution:
    def string_to_int(self,string_to_list):
        question_mark = 0
        sum = 0

        for i in string_to_list:
            if i == "?":
                question_mark +=1
            else:
                sum += int(i)
        return sum, question_mark

    def sumGame(self, num: str) -> bool:
        num_list = list(num)
        half = int(len(num_list)/2)

        first_half = num_list[:half]
        second_half = num_list[half:]

        first_half_sum, first_half_question = self.string_to_int(first_half)
        second_half_sum, second_half_question = self.string_to_int(second_half)

        diff = first_half_sum - second_half_sum
        question_diff = first_half_question - second_half_question

        if diff < -(question_diff//2)*9: return True
        # If the difference is too far away for Bob to reach on his own, Alice would play 0s


        if (question_diff - question_diff//2)* 9  > -diff: return True
        # If Alice can add 9s to the total to put the difference out of reach of Bob

        return False # Bob wins