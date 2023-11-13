package com.pluralsight;

public abstract class Contract {

    protected String date;

    protected String name;

    protected  String email;

    protected  String vehicleSold;

    protected double totalPrice;

    protected double monthlyPayment;



    public Contract(String date, String name, String email, String vehicleSold, double totalPrice) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
       // this.monthlyPayment = monthlyPayment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice(Vehicle vehicle);

    public abstract double getMonthlyPayment(Vehicle vehicle);



}

