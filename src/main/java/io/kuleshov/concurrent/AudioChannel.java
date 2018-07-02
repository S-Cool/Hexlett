package io.kuleshov.concurrent;

import java.util.Random;

public class AudioChannel {
    private int сhannellId;

    public AudioChannel(int id) {
        super();
        this.сhannellId = id;
    }

    public int getСhannellId() {
        return сhannellId;
    }

    public void setСhannellId(int id) {
        this.сhannellId = id;
    }

    public void using() {
        try {

            // использование канала
            Thread.sleep(new Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}