package edu.threads;

/**
 * Created by User on 5/9/2017.
 */
public class ThreadLocalAccess1 extends Thread {
    @Override
    public void run() {
        try {
            ThreadLocalCache.add("6");
            ThreadLocalCache.add("7");
            ThreadLocalCache.add("8");
            ThreadLocalCache.add("9");
            ThreadLocalCache.add("10");

            sleep(2000);

            ThreadLocalCache.print();

            sleep(2000);

            ThreadLocalCache.clear();
            ThreadLocalCache.printSize();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
