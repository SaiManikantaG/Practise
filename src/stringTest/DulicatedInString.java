package stringTest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

    /**
     * 6) How to find duplicate characters in a String? (solution)
     * You need to write a program to print all duplicate character and their count in Java. For example if given String
     * is "Programming" then your program should print
     * g : 2
     * r : 2
     * m : 2
     */
  class testMe {
        public Map<Character, Integer> duplicates(String s) {
            Map<Character, Integer> ch2count = new HashMap<>();
            if (s == null) return ch2count;
            s.chars().forEach(ch -> {
                if (ch2count.containsKey((char)ch)) {
                    ch2count.put((char) ch, ch2count.get((char)ch) + 1);
                } else {
                    ch2count.put((char) ch, 1);
                }
            });

            System.out.println(ch2count.entrySet().stream().filter(e -> e.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
            return ch2count.entrySet().stream().filter(e -> e.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }

    }

    class DulicatedInString
    {
        public static void main(String args[]){

            testMe testMe = new testMe();

            testMe.duplicates("testmeasitisneeded");
        }
    }