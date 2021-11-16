package com.company;

public class Student
{
    private String name;
    private String FacultetNo;
    private int bornYear;
    private double avgGrade;

    public Student(String name, String facultetNo, int bornYear, double avgGrade) {
        this.name = name;
        FacultetNo = facultetNo;
        this.bornYear = bornYear;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultetNo() {
        return FacultetNo;
    }

    public void setFacultetNo(String facultetNo) {
        FacultetNo = facultetNo;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getAge(int year)
    {
        return year - bornYear;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", FacultetNo='" + FacultetNo + '\'' +
                ", bornYear=" + bornYear +
                ", avgGrade=" + avgGrade;
    }
}
