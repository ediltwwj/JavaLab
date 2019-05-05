package com.container.sort;

public class Teacher {
    private String name;

    public Teacher() {
        this.name = null;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher Name : " + this.name;

    }
}
