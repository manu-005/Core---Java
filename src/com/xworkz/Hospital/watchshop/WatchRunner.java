package com.xworkz.Hospital.watchshop;

import com.xworkz.Hospital.theater.Movie;
import com.xworkz.Hospital.theater.Theater;

public class WatchRunner {
    public static void main(String[] args) {


        Watch watch1 = new Watch();
        watch1.setId(11);
        watch1.setName("Sonata");
        watch1.setCatagory("Digital");
        watch1.setCompany("Quatz");
        watch1.setColor("Purple");
        watch1.setPrice(488.00);

        Watch watch2 = new Watch();
        watch2.setId(12);
        watch2.setName("Fastrack");
        watch2.setCatagory("Touch");
        watch2.setCompany("Fastrack");
        watch2.setColor("Black");
        watch2.setPrice(999.00);

        WatchShop w = new WatchShop();

        w.addWatch(watch1);
        w.addWatch(watch2);

        w.getWatchdetails();
    }
}
