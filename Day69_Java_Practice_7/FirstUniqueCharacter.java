package Day69_Java_Practice_7;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> uniqueLetters = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if (uniqueLetters.containsKey(s.charAt(i))) {
                uniqueLetters.remove(s.charAt(i));
            } else {
                uniqueLetters.put(s.charAt(i), i);
            }
        }
        return uniqueLetters.values().stream().min(Integer::compare).orElse(-1);
    }
}
