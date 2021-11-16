package com.company;

public class Faculty extends Student
{
    private int diplomaYear;

    public Faculty(String name,
                   String facultetNo,
                   int bornYear,
                   double avgGrade, int diplomaYear)
    {
        super(name, facultetNo, bornYear, avgGrade);
        this.diplomaYear = diplomaYear;
    }

    public int getDiplomaYear() {
        return diplomaYear;
    }

    public void setDiplomaYear(int diplomaYear) {
        this.diplomaYear = diplomaYear;
    }

    @Override
    public String toString()
    {
        return "Faculty{" +
                "diplomaYear=" + diplomaYear +
                '}';
    }
}
