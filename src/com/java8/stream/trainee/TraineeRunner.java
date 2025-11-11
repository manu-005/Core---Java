package com.java8.stream.trainee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TraineeRunner {
    public static void main(String[] args) {

        List<TraineeDto> list = new ArrayList<>();

        list.add(new TraineeDto(6, "Darshan", "male", 32, "bglr", "hr"));
        list.add(new TraineeDto(4, "vinnu", "male", 22, "belagavi", "developer"));
        list.add(new TraineeDto(5, "modhak", "male", 42, "chikkamagaluru", "tester"));
        list.add(new TraineeDto(8, "preethu", "male", 12, "shivmogga", "analyst"));
        list.add(new TraineeDto(1, "chitz", "female", 34, "belagavi", "manager"));
        list.add(new TraineeDto(3, "tan", "female", 22, "bhagalkote", "tester"));


        List<TraineeDto> l = list.stream()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .collect(Collectors.toList());
        System.out.println(l);

        list.stream().sorted((o1, o2) -> (o1.getId() - o2.getId())).forEach(System.out::println);


    }
}
