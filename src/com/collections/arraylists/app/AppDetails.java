package com.collections.arraylists.app;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AppDetails implements Comparable<AppDetails>{

    private int id;
    private String name;
    private String type;
    private boolean isVeg;
    private double price;
    private String restaurantName;

    @Override
    public int compareTo(AppDetails o) {
        return this.getId() - o.getId();
    }
}