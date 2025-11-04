package com.collections.arraylists.trainees.comparator;

import com.collections.arraylists.trainees.Trainee;

import java.util.Comparator;

public class GenderComparator implements Comparator<Trainee> {
    @Override
    public int compare(Trainee o1, Trainee o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
