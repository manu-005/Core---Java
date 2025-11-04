package com.collections.arraylists.hospital;

import com.collections.arraylists.hospital.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HospitalRunner {

    public static void main(String[] args) {

        List<HospitalDetails> hospitals = new ArrayList();

        hospitals.add(new HospitalDetails(103,"Appollo","Hebbal",560032,"govt","bangalore"));
        hospitals.add(new HospitalDetails(101,"Sparsh","Hennur",560847,"govt aided","Mysore"));
        hospitals.add(new HospitalDetails(105,"Manipal","Byatarayanapura",560103,"own","Yelahanka"));
        hospitals.add(new HospitalDetails(107,"Aster","Kempapura",5603874,"private","Devanahalli"));

        System.out.println(hospitals);

        Collections.sort(hospitals);
        System.out.println(hospitals);

        Collections.sort(hospitals, new NameComparator());
        System.out.println(hospitals);

        Collections.sort(hospitals, new LocationComparator());
        System.out.println(hospitals);

        Collections.sort(hospitals, new DistComparator());
        System.out.println(hospitals);

        Collections.sort(hospitals, new TypeComparator());
        System.out.println(hospitals);

        Collections.sort(hospitals,new PinCodeComparator());
        System.out.println(hospitals);

    }

}
