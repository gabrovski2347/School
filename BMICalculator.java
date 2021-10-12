package com.company;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class BMICalculator
{
    private double weight;
    private double height;
    private double index;
    private String status;

    public double getBMI(Scanner scan)
    {
        System.out.println("Enter your weight in pounds ");
        var weight = scan.nextDouble();
        this.weight = weight * 0.4535924;

        System.out.println("Enter your height in inches ");
        var height = scan.nextDouble();
        this.height = height * 2.54;

        index = bmiFor();
        return index;
    }

    public String getStatus()
    {
        if (index < 18.5)
        {
            status = "underweight";
        }
        else if (index >= 18.5 && index < 25)
        {
            status = "normal";
        }
        else if (index >= 25 && index < 30)
        {
            status = "overweight";
        }
        else
        {
            status = "obese";
        }
        return status;
    }

    public void ReportResults(int number, double BMIIndex, String status)
    {
        var index = Math.round(BMIIndex);
        System.out.println("Person " + number + " has bmi = " + index + " ,your status is " + status);
    }

    private double bmiFor()
    {
        double index = 0;

        index = weight*703/ (height*height);

        return index;
    }
}
