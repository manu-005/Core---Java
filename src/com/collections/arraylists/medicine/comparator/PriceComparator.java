package com.collections.arraylists.medicine.comparator;

import com.collections.arraylists.medicine.MedicineDetails;

import java.util.Comparator;

public class PriceComparator implements Comparator<MedicineDetails> {
    @Override
    public int compare(MedicineDetails o1, MedicineDetails o2) {
        return (int)(o1.getPrice() - o2.getPrice());
    }
}
