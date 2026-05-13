package com.alchemist.logical;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String str = "Programming";
        HashMap<Character, Integer> map = countChar(str);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    
    public static HashMap<Character, Integer> countChar(String str) {
    	// Convert to lowercase (optional)
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        // Count character occurrence
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}