package com.pluralsight;

public class Vehicle {
    private int vin;
    private double price;
    private  String model;
    private String make;
    private int year;
    private String color;
    private int odometer;
    private String type;

    public Vehicle (int vin,String model,String make,String type,int year,String color,int odometer,double price){
        this.vin = vin;
        this.make = make;
        this.color= color;
        this.odometer= odometer;
        this. model= model;
        this.price= price;
        this.year= year;
        this.type= type;
    }


    public int getVin() {
        return this.vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return this.odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VIN: " + vin + " | Model: " + model + " | Make: " + make + " | Type: " + type +
                " | Year: " + year + " | Color: " + color + " | Odometer: " + odometer + " | Price: " + price;
    }
}