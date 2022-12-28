package Day69_Java_Practice_7;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> uniqueLetters = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            uniqueLetters.put(s.charAt(i), uniqueLetters.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (uniqueLetters.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
