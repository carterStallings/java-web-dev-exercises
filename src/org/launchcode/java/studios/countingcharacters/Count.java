package org.launchcode.java.studios.countingcharacters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        String name = "chelseafootballclub";

        for (char i: name.toCharArray()) {
            if (characters.containsKey(i)) {
                int ival = characters.get(i);
                characters.put(i, ival+1);
            } else {
                characters.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : characters.entrySet()) {
            System.out.println(letter);
        }
    }
}
