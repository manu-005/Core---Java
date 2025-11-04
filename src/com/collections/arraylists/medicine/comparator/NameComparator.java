package com.collections.arraylists.medicine.comparator;

import com.collections.arraylists.medicine.MedicineDetails;

import java.util.Comparator;

public class NameComparator implements Comparator<MedicineDetails> {
    @Override
    public int compare(MedicineDetails o1, MedicineDetails o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
