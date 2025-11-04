package com.collections.arraylists.chair;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@ToString@AllArgsConstructor
public class ChairDetails implements Comparable<ChairDetails> {

    private int id;
    private String name;
    private String color;
    private double price;
    private String meterial;
    private int count;

    @Override
    public int compareTo(ChairDetails o) {
        return this.getId() - o.getId();
    }
}
