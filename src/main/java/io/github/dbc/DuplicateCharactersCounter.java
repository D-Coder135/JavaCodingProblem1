package io.github.dbc;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCounter {
    /**
     * Counts the number of duplicate characters in a string.
     *
     * @param string String to count duplicate characters.
     * @return Map with characters and their count.
     */
    public Map<Character, Integer> countDuplicateCharacters(String string) throws IllegalArgumentException {
        HashMap<Character, Integer> map = new HashMap<>();
        if (string == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
