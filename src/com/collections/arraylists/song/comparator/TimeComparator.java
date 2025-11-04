package com.collections.arraylists.song.comparator;

import com.collections.arraylists.song.SongDetails;

import java.util.Comparator;

public class TimeComparator implements Comparator<SongDetails> {
    @Override
    public int compare(SongDetails o1, SongDetails o2) {
        return o1.getTime() - o2.getTime();
    }
}
