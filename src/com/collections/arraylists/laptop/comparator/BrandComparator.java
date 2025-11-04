package com.collections.arraylists.laptop.comparator;

import com.collections.arraylists.laptop.LaptopDetails;

import java.util.Comparator;

public class BrandComparator implements Comparator<LaptopDetails> {
    @Override
    public int compare(LaptopDetails o1, LaptopDetails o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
