package io.kuleshov.hackerrank;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] charArray = word.toCharArray();
        String answer = "Yes";
        int begin = 0;
        int finish = word.length() - 1;

        while (finish > begin) {
            if (charArray[begin] != charArray[finish]) {
                answer = "No";
            }
            ++begin;
            --finish;
        }
        System.out.println(answer);
    }
}