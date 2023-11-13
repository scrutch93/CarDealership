package com.pluralsight;

public class LeasingContract extends  Contract {

    //private double



    public LeasingContract(String date, String name, String email, String vehicleSold, double totalPrice) {
        super(date, name, email, vehicleSold, totalPrice);
    }

    @Override
    public double getTotalPrice(Vehicle vehicle) {
        return 0;
    }

    @Override
    public double getMonthlyPayment(Vehicle vehicle) {




        return 0;
    }
}
