package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        List<Integer>  integers = new ArrayList<>();

        integers.add(64);
        integers.add(923);
        integers.add(11);
        integers.add(74);
        integers.add(83);

        Stream<Integer> integerStream = integers.stream();
        Predicate<Integer> integerPredicate = (integer) -> {
            return ((integer % 2) == 0);
        };
        Stream<Integer> evenNumbers =  integerStream.filter(integerPredicate);
       // integerStream=  integerStream.filter(integerPredicate);
        List<Integer> anotherList = evenNumbers.collect(Collectors.toList());

        System.out.println(anotherList);
//
//    integers.stream().filter((integer) -> {
//        return ((integer % 2) == 0);

    }
}
