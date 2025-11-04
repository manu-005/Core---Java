package com.collections.arraylists.song.comparator;

import com.collections.arraylists.song.SongDetails;

import java.util.Comparator;

public class SongViewsComparator implements Comparator<SongDetails> {
    @Override
    public int compare(SongDetails o1, SongDetails o2) {
        return o1.getViews() - o2.getViews();
    }
}
