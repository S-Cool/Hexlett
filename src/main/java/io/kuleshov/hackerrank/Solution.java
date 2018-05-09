package io.kuleshov.hackerrank;

public class Solution {

    static int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2};
        int[] myArray = reverseArray(array);
        for (int v : myArray)
            System.out.println(v);
    }
}
