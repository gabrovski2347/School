package com.company;

public class Stock
{
    private double price;
    private String articuleNumber;

    public double getPrice() {
        return price;
    }

    public Stock(double price, String articuleNumber) {
        this.price = price;
        this.articuleNumber = articuleNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticuleNumber() {
        return articuleNumber;
    }

    public void setArticuleNumber(String articuleNumber) {
        this.articuleNumber = articuleNumber;
    }

    public double GetDiscount(double percent)
    {
        percent /= 100;
        var price = this.price;
        return  price -= price * percent;
    }
}
