package com.collections.arraylists.app.comparator;

import com.collections.arraylists.app.AppDetails;

import java.util.Comparator;

public class NameComparator implements Comparator<AppDetails> {
    @Override
    public int compare(AppDetails o1, AppDetails o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
