package Leetcode;

import java.util.HashMap;

public class P0242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for(char letter : s.toCharArray()) {
            if(hash.containsKey(letter))
                hash.put(letter, hash.get(letter) + 1);
            else hash.put(letter, 1);
        }
        for(char letter : t.toCharArray()) {
            if(hash.containsKey(letter)) {
                hash.put(letter, hash.get(letter) - 1);
            } else {
                return false;
            }
        }
        if(hash.values().stream().anyMatch( v -> v != 0)) return false;
        return true;
    }
}
