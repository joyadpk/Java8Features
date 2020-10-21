package com.java.features.streamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("first", "second", "third", "seventh");

        Predicate<String> p1 = p -> p.length() > 5;

        Predicate<String> p2 = p -> p.equals("seventh");

        List<String> list = new ArrayList<>();

        // here peek() is an intermediary operation so it will not print anything,
        // as they return a stream, they do not process data

        // stream.peek(System.out::println).filter(p1.or(p2)).peek(list::add);

        // forEach does not return anything, it is called final operation,
        // now all statements will execute.
        stream.peek(System.out::println).filter(p1.or(p2)).forEach(list::add);


        System.out.println("Done!!!");

        System.out.println("List Size : " + list.size());


    }
}
