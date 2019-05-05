package com.container.sort;

public class Student implements Comparable<Student> {
    private String name;

    public Student() {
        this.name = null;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return getName().compareTo(s.getName());
    }

    @Override
    public String toString() {
        return "Student Name : " + this.name;
    }
}

