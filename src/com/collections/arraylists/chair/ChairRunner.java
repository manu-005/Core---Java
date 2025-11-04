package com.collections.arraylists.chair;

import com.collections.arraylists.chair.comparator.NameComparator;

import java.util.*;

public class ChairRunner {

    public static void main(String[] args) {

        Set<ChairDetails> chairs = new HashSet<>();

        chairs.add(new ChairDetails(14,"Sitting","black",88.0,"plastic",7));
        chairs.add(new ChairDetails(14,"Sitting","black",88.0,"plastic",7));
        chairs.add(new ChairDetails(12,"Semi Sitting","blue",898.0,"wooden",5));
        chairs.add(new ChairDetails(19,"Sleeper","red",38.0,"iron",2));


        System.out.println(chairs);




    }
}
