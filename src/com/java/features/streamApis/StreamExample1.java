package com.java.features.streamApis;


import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample1 {

    public static void main(String [] args) {

        Stream<String> stream = Stream.of("first", "second", "third", "seventh");

        // simply print out the stream data

       // stream.forEach(a -> System.out.println(a));

        // let's create a Predicate and filter our data

        Predicate<String> p1 = p -> p.length() > 5;

        // new let's pass this filer into our stream and print the filtered data

       // stream.filter(p1).forEach(System.out::println);

        // Now let's chain 2 predicates together

        Predicate<String> p2 = p -> p.equals("seventh");

       // stream.filter(p1.and(p2)).forEach(System.out::println);

        stream.filter(p1.or(p2)).forEach(System.out::println);

    }

}
