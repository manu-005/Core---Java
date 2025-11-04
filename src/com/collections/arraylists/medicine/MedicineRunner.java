package com.collections.arraylists.medicine;

import com.collections.arraylists.medicine.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicineRunner {
    public static void main(String[] args) {

        List<MedicineDetails> medicines = new ArrayList<>();

        medicines.add(new MedicineDetails(107,"dolo","faver",10,20.00,"blue"));
        medicines.add(new MedicineDetails(105,"paracetamol","pain relief",200,25.00,"white"));
        medicines.add(new MedicineDetails(101,"cetirizine","allergy",100,40.00,"freen"));
        medicines.add(new MedicineDetails(104,"dolo 650","headache",100,60.00,"orange"));


        System.out.println(medicines);

        Collections.sort(medicines,new ColorComparator());
        System.out.println(medicines);

        Collections.sort(medicines,new DoseComparator());
        System.out.println(medicines);

        Collections.sort(medicines,new NameComparator());
        System.out.println(medicines);

        Collections.sort(medicines,new PriceComparator());
        System.out.println(medicines);

        Collections.sort(medicines,new PurposeComparator());
        System.out.println(medicines);
    }
}
