package com.container.hashset;

import java.util.Set;
import java.util.HashSet;

public class EqualsCheck {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        // 先调用HashCode()，如果一样，再调用equals()
        System.out.println("Test First : ");
        hashSet.add(new Student("Nick", 18));
        System.out.println("Test Second : ");
        hashSet.add(new Student("Jorden", 20));
        System.out.println("Test Third : ");
        hashSet.add(new Student("Nick", 18)); // 重复
    }

}
