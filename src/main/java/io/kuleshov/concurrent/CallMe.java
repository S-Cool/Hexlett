package io.kuleshov.concurrent;

public class CallMe {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
        System.out.println("]");
    }

    public static class Caller implements Runnable {
        String msg;
        CallMe target;
        Thread t;

        public Caller(String s, CallMe targ) {
            this.msg = s;
            this.target = targ;
            t = new Thread(this);
            t.start();
        }

        public void run() {
            target.call(msg);
        }
    }

    static class Synch {
        public static void main(String[] args) {
            CallMe target = new CallMe();
            Caller ob1 = new Caller("Welcome", target);
            Caller ob2 = new Caller("Sync", target);
            Caller ob3 = new Caller("world", target);

            try {
                ob1.t.join();
                ob2.t.join();
                ob3.t.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}
