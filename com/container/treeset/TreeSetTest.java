package com.container.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> studentSets = new TreeSet<Student>();
        studentSets.add(new Student("100001", "Mike", 298));
        studentSets.add(new Student("100003", "James", 287));
        studentSets.add(new Student("100002", "Harden", 290));
        studentSets.add(new Student("100005", "Paul", 277));
        studentSets.add(new Student("100004", "Nick", 287));
        studentSets.add(new Student("100004", "Nick", 287));

        Iterator<Student> its = studentSets.iterator();
        while (its.hasNext()) {
            Student s = its.next();
            System.out.println(s);
        }
    }
}
