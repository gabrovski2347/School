package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        printIntroduction();
        Scanner scan = new Scanner(System.in);
        BMICalculator mycalculator = new BMICalculator();
        double index = mycalculator.getBMI(scan);
        String status = mycalculator.getStatus();
        mycalculator.ReportResults(1, index, status);
    }

    public static void printIntroduction()
    {
        System.out.println("This is Gabrovski's calculator");
        // add working mod
    }
}

