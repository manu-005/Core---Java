package com.collections.arraylists.laptop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString@AllArgsConstructor
public class LaptopDetails implements Comparable<LaptopDetails>{

    private int id;
    private String name;
    private String brand;
    private String company;
    private double price;
    private int ram;

    @Override
    public int compareTo(LaptopDetails o) {
        return this.getId() - o.getId();
    }
}
