package edu.java.eight;

import java.util.*;

/**
 * Created by User on 6/8/2017.
 */
public class ListsMapSimplified {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        addToMap( map, "NFR", "Tharanga");
        addToMap( map, "NFR", "Dilum");
        addToMap( map, "ART", "Hasala");
        addToMap( map, "NFR", "Uthpala");
        addToMap( map, "ART", "Sanjith");
        addToMap( map, "ART", "Nilaksha");
        addToMap( map, "NFR", "Udana");
        addToMap( map, "NFR", "Suresh");
        addToMap( map, "ART", "Rajeev");

        printValues( map );
    }

    private static void addToMap( Map<String, List<String>> empMap, String key, String value )
    {
        empMap.computeIfAbsent( key, n -> new ArrayList() ).add( value );
    }

    private static void printValues( Map<String, List<String>> empMap )
    {
        empMap.values().forEach( l -> System.out.println( l ) );
    }
}
