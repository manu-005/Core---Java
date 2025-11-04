package com.collections.arraylists.student.comparator;

import com.collections.arraylists.student.StudentDetails;

import java.util.Comparator;

public class StudentYearComparator implements Comparator<StudentDetails> {
    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getYear() - o2.getYear();
    }
}
