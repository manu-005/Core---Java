package com.collections.arraylists.app.comparator;

import com.collections.arraylists.app.AppDetails;

import java.util.Comparator;

public class PriceComparator implements Comparator<AppDetails> {
    @Override
    public int compare(AppDetails o1, AppDetails o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
