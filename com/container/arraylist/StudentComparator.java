package com.container.arraylist;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStuId().compareTo(s2.getStuId());
    }
}
