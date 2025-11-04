package com.collections.arraylists.hospital.comparator;

import com.collections.arraylists.hospital.HospitalDetails;

import java.util.Comparator;

public class LocationComparator implements Comparator<HospitalDetails> {
    @Override
    public int compare(HospitalDetails o1, HospitalDetails o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}
