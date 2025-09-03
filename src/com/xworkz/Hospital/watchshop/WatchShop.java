package com.xworkz.Hospital.watchshop;

import com.xworkz.Hospital.theater.Movie;

public class WatchShop {

    int index;
    Watch[] watches = new Watch[2];

    public void addWatch(Watch watch) {

        if (watch != null) {

            watches[index++] = watch;
        } else {
            System.out.println("Invalid Watch");
        }
    }

    public void getWatchdetails() {

        System.out.println("Watch Details ");

        for (Watch w : watches) {
            System.out.println("Id =" + w.getId());
            System.out.println("Name =" + w.getName());
            System.out.println("CAtagory =" + w.getCatagory());
            System.out.println("Company =" + w.getCompany());
            System.out.println("Color =" + w.getColor());
            System.out.println("Price =" + w.getPrice());
            System.out.println("-----------------------------");
        }

    }
}
