package com.collections.arraylists.trainees;

import com.collections.arraylists.trainees.comparator.*;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        List<Trainee> trainees = new ArrayList();

        trainees.add(new Trainee(1, "MAnu", "male", 23, 101, 89.8));
        trainees.add(new Trainee(4, "Alice", "female", 33, 105, 49.8));
        trainees.add(new Trainee(6, "Babu", "male", 43, 103, 67.8));
        trainees.add(new Trainee(11, "Manoj", "male", 28, 100, 99.0));
        trainees.add(new Trainee(2, "Anu", "female", 13, 102, 85.9));

        for (Trainee n : trainees) {
            System.out.println(n);
             }
        System.out.println("------------------------------------");


        Collections.sort(trainees);
        for (Trainee n : trainees) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");

        Collections.sort(trainees,new NameComparator());
        for (Trainee n : trainees) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");


        Collections.sort(trainees,new GenderComparator());
        for (Trainee n : trainees) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");

        Collections.sort(trainees,new AgeComparator());
        for (Trainee n : trainees) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");

        Collections.sort(trainees,new PercentageComparator());
        for (Trainee n : trainees) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");

        Collections.sort(trainees,new RegNoComparator());
        for (Trainee n : trainees) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");

    }
}

