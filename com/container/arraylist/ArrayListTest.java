package com.container.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1001", "Nick", 85));
        list.add(new Student("1002", "Mike", 90));
        list.add(new Student("1004", "Park", 70));
        list.add(new Student("1003", "Mary", 88));
        list.add(new Student("1005", "Tony", 70));

        // 按总分升序
        Collections.sort(list);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
        // 按学号升序
        list.sort(new StudentComparator());
        Iterator<Student> iteratorA = list.iterator();
        iteratorA.forEachRemaining(System.out::println);
    }
}
