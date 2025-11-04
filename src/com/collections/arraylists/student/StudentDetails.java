package com.collections.arraylists.student;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter@Getter
@ToString
public class StudentDetails implements Comparable<StudentDetails>{

    private int regNo;
    private String name;
    private String course;
    private String section;
    private int year;
    private int semester;
    private int backlogs;

    @Override
    public int compareTo(StudentDetails o) {
        return this.regNo - (o.regNo);
    }
}
