package com.collections.arraylists.student.comparator;

import com.collections.arraylists.student.StudentDetails;

import java.util.Comparator;
import java.util.List;

public class StudentNameComparator implements Comparator<StudentDetails>{


    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
