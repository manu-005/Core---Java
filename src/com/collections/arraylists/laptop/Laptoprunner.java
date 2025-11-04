package com.collections.arraylists.laptop;

import com.collections.arraylists.laptop.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptoprunner {

    public static void main(String[] args) {

        List<LaptopDetails> laptops = new ArrayList();

        laptops.add(new LaptopDetails(104,"lattitude","Hp","HP",60000,8));
        laptops.add(new LaptopDetails(102,"lattitude","Asus","Vivo",15000,16));
        laptops.add(new LaptopDetails(101,"Personnal","DELL","DELL",56000,32));
        laptops.add(new LaptopDetails(103,"Gaming","Mac","MACBook",106000,4));

        System.out.println(laptops);

        Collections.sort(laptops);
        System.out.println(laptops);

        Collections.sort(laptops,new BrandComparator());
        System.out.println(laptops);

        Collections.sort(laptops,new CompanyComparator());
        System.out.println(laptops);

        Collections.sort(laptops,new NameComparator());
        System.out.println(laptops);

        Collections.sort(laptops,new RamComparator());
        System.out.println(laptops);

        Collections.sort(laptops,new PriceComparator());
        System.out.println(laptops);

    }
}
