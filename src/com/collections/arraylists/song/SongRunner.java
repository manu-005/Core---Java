package com.collections.arraylists.song;

import com.collections.arraylists.song.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongRunner {

    public static void main(String[] args) {

        List<SongDetails> songs = new ArrayList<>();

        songs.add(new SongDetails(1008,"Rozaa Huuve","Me","Janyaa",6,200));
        songs.add(new SongDetails(1002,"Huuvina lokave","Not me","Myfriend",7,1600));
        songs.add(new SongDetails(1006,"Upavasa","friend","vinnu",2,1900));
        songs.add(new SongDetails(1003,"Radhe","Harii","praveen",4,500));
        songs.add(new SongDetails(1009,"kannadiga","Krish","Pradeep",1,10900));

        System.out.println(songs);

        Collections.sort(songs);
        System.out.println(songs);

        Collections.sort(songs,new ViewsCOmparator());
        System.out.println(songs);

        Collections.sort(songs,new TimeComparator());
        System.out.println(songs);

        Collections.sort(songs,new SongWriterComparator());
        System.out.println(songs);

        Collections.sort(songs,new SongViewsComparator());
        System.out.println(songs);

        Collections.sort(songs,new SongNameComparator());
        System.out.println(songs);

        Collections.sort(songs, new SingerNameComparator());
        System.out.println(songs);

        Collections.sort(songs);
        System.out.println(songs);

    }
}
