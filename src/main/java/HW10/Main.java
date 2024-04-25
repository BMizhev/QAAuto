package HW10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (String sentence : args) {
            for (char letter : sentence.toCharArray()) {
                if (Character.isLetter(letter)) {
                    letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}