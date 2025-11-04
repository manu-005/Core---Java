package com.collections.arraylists.song;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class SongDetails implements Comparable<SongDetails> {

    private int id;
    private String name;
    private String writer;
    private String  singer;
    private int time;
    private int views;

    @Override
    public int compareTo(SongDetails o) {
        return this.getId() - o.getId();
    }
}
