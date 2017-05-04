package io.kuleshov.graph;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
//        Inode root = new NodeMutable(0);
        Inode root = new NodeImmutable(0, null, null);
        for (int i = 0; i < 1_000; i++){
            root = root.add(random.nextInt()%500);
//            root = root.add(i);

        }
        root.print();
        System.out.printf("Count: %d", root.count());
    }
}
