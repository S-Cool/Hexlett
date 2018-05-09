package io.kuleshov.hackerrank;

import java.util.*;

public class Solution {

    static void miniMaxSum(int[] arr) {

        long sum = 0;
        long min = 1000000000;
        long max = 0;

        for (int i = 0; i < 5; i++) {

            sum = sum + arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
