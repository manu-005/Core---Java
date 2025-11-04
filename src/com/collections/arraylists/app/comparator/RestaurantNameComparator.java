package com.collections.arraylists.app.comparator;

import com.collections.arraylists.app.AppDetails;

import java.util.Comparator;

public class RestaurantNameComparator implements Comparator<AppDetails> {
    @Override
    public int compare(AppDetails o1, AppDetails o2) {
        return o1.getRestaurantName().compareTo(o2.getRestaurantName());
    }
}
