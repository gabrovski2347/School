package com.company;

public class TV extends Stock
{
    private String manufacter;
    private String model;
    private int power;

    public TV(double price, String articuleNumber, String manufacter, String model, int power) {
        super(price, articuleNumber);
        this.manufacter = manufacter;
        this.model = model;
        this.power = power;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
