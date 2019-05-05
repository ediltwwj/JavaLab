package com.container.sort;

import java.util.Comparator;

public class TeacherComparetor implements Comparator<Teacher> {

    @Override
    public int compare(Teacher t1, Teacher t2) {
        return t2.getName().compareTo(t1.getName());
    }
}
