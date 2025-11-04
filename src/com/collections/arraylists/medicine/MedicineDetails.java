package com.collections.arraylists.medicine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter@Getter@AllArgsConstructor@ToString
public class MedicineDetails implements Comparable<MedicineDetails> {

    private int id ;
    private String name;
    private String purpose;
    private int dose;
    private double price;
    private String colour;



    @Override
    public int compareTo(MedicineDetails o) {
        return this.getId() - o.getId();
    }
}
