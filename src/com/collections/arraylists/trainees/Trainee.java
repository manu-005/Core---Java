package com.collections.arraylists.trainees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Trainee implements Comparable<Trainee>{

    private int id;
    private String name;
    private String gender;
    private int age;
    private int regno;
    private double percentage;

    @Override
    public int compareTo(Trainee o) {
        return this.getId() - o.getId();
    }
}
