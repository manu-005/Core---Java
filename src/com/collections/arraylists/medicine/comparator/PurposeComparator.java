package com.collections.arraylists.medicine.comparator;

import com.collections.arraylists.medicine.MedicineDetails;

import java.util.Comparator;

public class PurposeComparator implements Comparator<MedicineDetails> {
    @Override
    public int compare(MedicineDetails o1, MedicineDetails o2) {
        return o1.getPurpose().compareTo(o2.getPurpose());
    }
}
