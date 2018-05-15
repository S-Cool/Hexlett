package io.kuleshov.hackerrank;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] mass = {9, 7, 2, 5, 12, 3, 33, 1, 4, 1, 23};
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int swap = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
