package com.container.sort;

public class SortTest {
    public static void main(String[] args) {
        // 使用自然排序（名字升序）
        System.out.println("使用自然排序（名字升序）:");
        Student[] students = {new Student("cStudent"), new Student("dStudent"),
                new Student("bStudent"), new Student("aStudent")};
        MyTool.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        // 使用比较器排序（名字降序）
        System.out.println("使用比较器排序（名字降序）:");
        Teacher[] teachers = {new Teacher("cTeacher"), new Teacher("dTeacher"),
                new Teacher("bTeacher"), new Teacher("aTeacher")};
        MyTool.sort(teachers, new TeacherComparetor());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
