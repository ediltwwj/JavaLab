package com.container.treeset;

public class Student {
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

    @Override
    public String toString() {
        return "学号: " + this.stuId + ", 姓名: " + this.stuName + ", 总分: " + this.totalScore;
    }
}
