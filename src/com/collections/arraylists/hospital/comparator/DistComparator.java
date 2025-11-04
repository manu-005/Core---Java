package com.collections.arraylists.hospital.comparator;

import com.collections.arraylists.hospital.HospitalDetails;

import java.util.Comparator;

public class DistComparator implements Comparator<HospitalDetails >{
    @Override
    public int compare(HospitalDetails o1, HospitalDetails o2) {
        return o1.getDist().compareTo(o2.getDist());
    }
}
