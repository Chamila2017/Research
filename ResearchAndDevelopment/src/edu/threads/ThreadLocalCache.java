package edu.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/9/2017.
 */
public class ThreadLocalCache {
    private static final ThreadLocal<List<String>> threadLocal = new ThreadLocal<List<String>>(){
        @Override
        protected List<String> initialValue() {
            return new ArrayList();
        }
    };

    public static void add( String text ) {
        threadLocal.get().add( text );
    }

    public static void clear() {
        threadLocal.get().clear();
    }

    public static void print(){
        for (String s : ThreadLocalCache.threadLocal.get()) {
            System.out.println("ThreadLocalAccess " + s);
        }
    }

    public static void printSize(){
        System.out.println("ThreadLocalAccess Size " + ThreadLocalCache.threadLocal.get().size());
    }
}
