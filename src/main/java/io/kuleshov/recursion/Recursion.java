package io.kuleshov.recursion;

public class Recursion {
    int value[];

    public Recursion(final int i) {
      value = new int[i];
    }

   void printArray(final int i){
        if (i == 0) return;
        else printArray(i - 1);
       System.out.println("[" + (i - 1) + "]" + value[i - 1]);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion(10);
        int i;
        for (i=0; i<10; i++) recursion.value[i] = i;
        recursion.printArray(10);
    }
}
