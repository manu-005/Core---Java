package com.collections.arraylists.song.comparator;

import com.collections.arraylists.song.SongDetails;

import java.util.Comparator;

public class SingerNameComparator implements Comparator<SongDetails> {

    @Override
    public int compare(SongDetails o1, SongDetails o2) {
        return o1.getSinger().compareTo(o2.getSinger());
    }
}
