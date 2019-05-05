package com.container.arraylist;

import java.util.*;

public class Student implements Comparable {
    private String stuId;  // 学号
    private String stuName;  // 姓名
    private int totalScore;  // 总分

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Student(String stuId, String stuName, int totalScore) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "学号: " + this.stuId + ", 姓名: " + this.stuName + ", 总分: " + this.totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;

        Student s = (Student) o;

        if (this.stuId.equals(s.stuId))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int result;

        result = (this.stuName == null ? 0 : this.stuName.hashCode());
        result += this.stuId.hashCode();

        return result;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        int result = this.totalScore > s.totalScore ? 1 : (this.totalScore == s.totalScore ? 0 : -1);
        result = -result;  // 因为是降序

        if (0 == result)
            result = this.stuName.compareTo(s.stuName); // compareTo比较对象

        return result;
    }
}
