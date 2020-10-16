package com.java.features.lambdaExpressions;

import java.util.ArrayList;

public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);

        numbers.forEach(System.out::println);
    }
}