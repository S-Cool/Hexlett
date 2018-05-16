package io.kuleshov.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InterviewTest {
    public static void main(String[] args) {
        process("abcbbcabcbbcc");
    }

    public static void process(String str) {
        Set<Character> ustr = new HashSet();
        HashMap<Character, Integer> chCount = new HashMap();
        for (char ch : str.toCharArray()) {
            ustr.add(ch);
        }
        for (char uch : ustr) {
            for (char ch : str.toCharArray()) {
                if (uch == ch) {
                    if (chCount.containsKey(uch)) {
                        chCount.put(uch, chCount.get(uch) + 1);
                    } else chCount.put(uch, 1);
                }

            }
        }
        String result = "";
        for (char uch : chCount.keySet()) {
            result = result + chCount.get(uch) + String.valueOf(uch);
        }
        System.out.println(result);
    }
}
