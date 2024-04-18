package HW10;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        for (String str : args) {
//            System.out.println(str.length());
//       }

//        String str = args[0];
//                char[] chars = str.toCharArray();
//        System.out.println(chars.length);

        TreeMap<String, Integer> wordLengths = new TreeMap<>();

        for (String sentence : args) {
            String[] words = sentence.trim().split(" ");

            for (String word : words) {
                wordLengths.put(word, word.length());
            }
        }

        for (Map.Entry<String, Integer> entry : wordLengths.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
