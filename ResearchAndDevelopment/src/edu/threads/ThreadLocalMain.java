package edu.threads;

/**
 * Created by User on 5/9/2017.
 */
public class ThreadLocalMain {
    public static void main(String[] args) {
        ThreadLocalAccess t1 = new ThreadLocalAccess();
        t1.start();

        ThreadLocalAccess1 t2 = new ThreadLocalAccess1();
        t2.start();
    }
}
