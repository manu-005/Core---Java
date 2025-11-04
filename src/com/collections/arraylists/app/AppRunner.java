package com.collections.arraylists.app;

import com.collections.arraylists.app.comparator.NameComparator;
import com.collections.arraylists.app.comparator.PriceComparator;
import com.collections.arraylists.app.comparator.RestaurantNameComparator;
import com.collections.arraylists.app.comparator.TypeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {

        List<AppDetails> apps = new ArrayList<AppDetails>();

        apps.add(new AppDetails(101,"idli","breakfast",true,100.00,"Meghanas "));
        apps.add(new AppDetails(102,"dosa","breakfast",true,90.00,"Krutunga"));
        apps.add(new AppDetails(103,"roti meals","lunch",true,190.00,"Taj Hotel"));
        System.out.println(apps);

        Collections.sort(apps, new NameComparator());
        System.out.println(apps);

        Collections.sort(apps, new TypeComparator());
        System.out.println(apps);

        Collections.sort(apps, new PriceComparator());
        System.out.println(apps);

        Collections.sort(apps, new RestaurantNameComparator());
        System.out.println(apps);


    }
}
