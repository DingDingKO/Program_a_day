class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        dictionary.sort()
        words_from_sentance = sentence.split(" ")

        for i in range(len(words_from_sentance)):
            for j in dictionary:
                if words_from_sentance[i].startswith(j):
                    words_from_sentance[i] = j
                    break

        return " ".join(words_from_sentance)
