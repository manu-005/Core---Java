package com.collections.arraylists.chair.comparator;

import com.collections.arraylists.chair.ChairDetails;

import java.util.Comparator;

public class NameComparator implements Comparator<ChairDetails> {
    @Override
    public int compare(ChairDetails o1, ChairDetails o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
