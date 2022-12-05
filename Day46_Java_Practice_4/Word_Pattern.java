package Day46_Java_Practice_4;

import java.util.HashMap;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> stringCharacterHashMap = new HashMap<>();
        String[] s1 = s.split(" ");

        if(s1.length != pattern.length()){
            return false;
        }

        for (int i = 0; i < s1.length; i++) {
            if (!stringCharacterHashMap.containsKey(s1[i]) && !stringCharacterHashMap.containsValue(pattern.charAt(i))){
                stringCharacterHashMap.put(s1[i], pattern.charAt(i));

            } else if (!stringCharacterHashMap.containsKey(s1[i]) || !stringCharacterHashMap.containsValue(pattern.charAt(i)) || !stringCharacterHashMap.get(s1[i]).equals(pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
