package com.collections.arraylists.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString@AllArgsConstructor
public class HospitalDetails implements Comparable<HospitalDetails>{

    private int id;
    private String name;
    private String location;
    private int pincode;
    private String type;
    private String dist;

    @Override
    public int compareTo(HospitalDetails o) {
        return this.getId() - o.getId();
    }
}
