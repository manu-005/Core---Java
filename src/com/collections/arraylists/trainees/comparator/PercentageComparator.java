package com.collections.arraylists.trainees.comparator;

import com.collections.arraylists.trainees.Trainee;

import java.util.Comparator;

public class PercentageComparator implements Comparator<Trainee> {
    @Override
    public int compare(Trainee o1, Trainee o2) {
        return (int) (o1.getPercentage() - o2.getPercentage());
    }
}
