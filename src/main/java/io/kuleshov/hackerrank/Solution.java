package io.kuleshov.hackerrank;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();

        if (s.length() > 400000) {
            System.out.print("");
        } else if (s.length() == 0) {
            System.out.print(0);
        } else {
            String arr[] = s.split("[ !,?._'@]+");
            System.out.println(arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}