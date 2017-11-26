package edu.threads;

/**
 * Created by User on 5/9/2017.
 */
public class ThreadLocalAccess extends Thread {
    @Override
    public void run() {
        try {
            ThreadLocalCache.add("1");
            ThreadLocalCache.add("2");
            ThreadLocalCache.add("3");
            ThreadLocalCache.add("4");
            ThreadLocalCache.add("5");

            sleep(2000);

            ThreadLocalCache.print();

            sleep(2000);

            ThreadLocalCache.printSize();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
