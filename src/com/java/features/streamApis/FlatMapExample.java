package com.java.features.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(6, 7, 8);
        List<Integer> l3 = Arrays.asList(9, 0);

        List<List<Integer>> list = Arrays.asList(l1, l2, l3);

        Function<List<?>, Integer> mapper = List::size;

        // this is map operation, which returns the size of each list
        //list.stream().map(mapper).forEach(System.out::println);

        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();

        // the flatmap takes an object and returns a stream of an object.
        list.stream().flatMap(flatMapper).forEach(System.out::println);


    }
}
