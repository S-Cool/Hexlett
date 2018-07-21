package io.kuleshov.concurrent.synchronize;

import java.io.IOException;

public class SynchroRun {
    public static void main(String[] args) {
        Resource resource = null;
        try {
            resource = new Resource("data\\result.txt");
            SyncThread t1 = new SyncThread("First", resource);
            SyncThread t2 = new SyncThread("Second", resource);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (IOException e) {
            System.err.print("ошибка файла: " + e);
        } catch (InterruptedException e) {
            System.err.print("ошибка потока: " + e);
        } finally {
            resource.close();
        }
    }
}