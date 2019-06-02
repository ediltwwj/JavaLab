package com.io.five;


import java.io.*;

class Student implements Serializable {
    private String stuName;
    private int stuAge;

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student [" + "Name : " + this.stuName + ",Age : " + this.stuAge + "]";
    }
}

public class Demo5 {
    public static void main(String[] args) throws Exception {
        String fileName = "D:\\编程\\JavaLab\\com\\io\\five\\demo5.obj";
        Student[] stus = {
                new Student("Mike", 18),
                new Student("Pick", 20),
                new Student("Sia", 19)
        };
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        for (Student s : stus) {
            oos.writeObject(s);
        }
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

        System.out.println("反序列化输出 :");
        try {
            while (true) {
                Student s = (Student) ois.readObject();
                System.out.println(s);
            }
        } catch (EOFException e) {
            System.out.println("已读取到文件末尾");
        } finally {
            ois.close();
        }
    }
}
