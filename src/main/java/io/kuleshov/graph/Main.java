package io.kuleshov.graph;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
//        Inode root = new NodeMutable(0);
        Inode root = new NodeImmutable(0, null, null);
        for (int i = 0; i < 1_000; i++) {
            root = root.add(random.nextInt() % 500);
//            root = root.add(i);

        }
        root.forEach(new Printer());
        System.out.printf("Count: %d", root.count());
    }

    private static class Printer implements Inode.Iconsumer<Integer> {


        @Override
        public void consume(Integer value) {
            if (value % 2 == 0) System.out.println(value);
        }
    }
}
