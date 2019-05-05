package com.container.hashset;

public class Student {
    private String name;  // 姓名
    private int age;  // 年龄

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof com.container.map.second.Student))
            return false;

        Student s = (Student) o;

        if ((this.name.equals(s.name)) && (this.age == s.age))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int result;

        result = (this.name == null ? 0 : this.name.hashCode());
        result += this.age;

        return result;
    }
}
