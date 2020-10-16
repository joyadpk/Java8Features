package com.java.features.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultipleParameters {

    public static void main(String[] args) {

        // Comparator Anonymous class with 2 parameters

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        };

        Comparator<String> lambdaComparator = (s1, s2) ->  Integer.compare(s1.length(), s2.length());

        List<String> list = Arrays.asList("****", "**", "*", "***");

//        Collections.sort(list, comparator);

        Collections.sort(list, lambdaComparator);

        for(String s: list ) {
            System.out.println(s);
        }
    }
}
