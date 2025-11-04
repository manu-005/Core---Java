package com.collections.arraylists.student;

import com.collections.arraylists.student.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        //  StudentDetails std1 = new StudentDetails();

        List<StudentDetails> students = new ArrayList();

        students.add(new StudentDetails(11, "Vinayaak", "mca", "e", 2025, 4, 1));
        students.add(new StudentDetails(2, "Siddu", "dental", "e", 2021, 1, 2));
        students.add(new StudentDetails(3, "Pramod", "tech", "e", 2025, 5, 4));
        students.add(new StudentDetails(14, "Preetham", "ortho", "e", 2028, 3, 3));
        students.add(new StudentDetails(5, "Bharath", "civil", "e", 2025, 1, 1));
        students.add(new StudentDetails(16, "Darshan", "mech", "e", 2025, 2, 2));
        students.add(new StudentDetails(7, "Prasad", "msc", "e", 2025, 7, 7));
        students.add(new StudentDetails(8, "Sharan", "ba", "e", 2024, 4, 2));
        students.add(new StudentDetails(19, "Kumar", "Ma", "e", 2025, 3, 2));
        students.add(new StudentDetails(10, "Madhu", "physology", "e", 2025, 2, 5));
        students.add(new StudentDetails(1, "Modhak", "sychology", "e", 2025, 5, 2));
        students.add(new StudentDetails(12, "Jai ", "commerce", "e", 2029, 7, 1));
        students.add(new StudentDetails(13, "Shree", "medical", "e", 2033, 2, 5));
        students.add(new StudentDetails(4, "Ram", "science", "e", 2025, 4, 2));
        students.add(new StudentDetails(15, "Ramu", "math", "e", 2025, 6, 7));
        students.add(new StudentDetails(6, "RAni", "web", "e", 2025, 8, 6));
        students.add(new StudentDetails(17, "RAma", "cs", "e", 2025, 8, 3));
        students.add(new StudentDetails(28, "RAnga", "bsc", "e", 2025, 4, 1));
        students.add(new StudentDetails(39, "Vinnu", "bba", "e", 2025, 3, 6));
        students.add(new StudentDetails(20, "vinod", "mba", "e", 2025, 5, 5));

        Collections.sort(students);
        System.out.println(students);

        StudentNameComparator nameCompare = new StudentNameComparator();

        Collections.sort(students, nameCompare);
        System.out.println(students);

        Collections.sort(students, new StudentCourseComparator());
        System.out.println(students);

        Collections.sort(students, new StudentYearComparator());
        System.out.println(students);

        Collections.sort(students, new SemesterComparator());
        System.out.println(students);

        Collections.sort(students,new BacklogsComparator());
        System.out.println(students);

    }

}