package com.collections.arraylists.laptop.comparator;

import com.collections.arraylists.laptop.LaptopDetails;

import java.util.Comparator;

public class PriceComparator implements Comparator<LaptopDetails> {
    @Override
    public int compare(LaptopDetails o1, LaptopDetails o2) {
        return (int)(o1.getPrice() - o2.getPrice());
    }
}
