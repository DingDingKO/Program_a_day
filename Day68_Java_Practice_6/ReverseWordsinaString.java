package Day68_Java_Practice_6;

public class ReverseWordsinaString {
    
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String[] reversed = new String[words.length];

        for (int i = 0, j = words.length - 1; 0 <= j; --j, ++i){
            reversed[i] = words[j];
        }
        return String.join(" ", reversed).stripTrailing();
    }
}
