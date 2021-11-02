package com.company;

public class Main
{

    public static void main(String[] args)
    {
        var book = new Book(30, "22", "Grigor", "Bioghraphy");
        var tv = new TV(500, "2", "Sony", "x-2", 100);

        var newBookPrice = book.GetDiscount(15);
        var newTVPrice = tv.GetDiscount(9);

        System.out.println(newBookPrice);
        System.out.println(newBookPrice);
        System.out.println( newTVPrice);
    }
}
