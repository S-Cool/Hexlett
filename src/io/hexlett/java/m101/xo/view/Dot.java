package io.hexlett.java.m101.xo.view;

public class Dot {

    private volatile int x;

    private volatile int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Dot dot = new Dot(0, 0);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                if (dot.getX() != dot.getY()) {
                    System.out.printf("0_0, %d, %d \n", dot.getX(), dot.getY());
                }
            }
        }).start();

        for (int i2 = 0; i2 < 2_000_000; i2++)
            for (int i = 0; i < 100; i++) {
                dot.setX(i);
                dot.setY(i);
            }
    }
}
