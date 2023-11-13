package com.pluralsight;

public class LeasingContract extends  Contract {

    private double endingValue;

    private double leaseFee;


    public LeasingContract(String date, String name, String email, String vehicleSold, double totalPrice) {
        super(date, name, email, vehicleSold, totalPrice);
    }

    public double getEndingValue(Vehicle vehicle) {

        endingValue = 0.50 * vehicle.getPrice();


        return endingValue;
    }

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public double getLeaseFee(Vehicle vehicle) {

        leaseFee = 0.07 * vehicle.getPrice();

        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice(Vehicle vehicle) {

       totalPrice = (getMonthlyPayment(vehicle) * 36) + getLeaseFee(vehicle);


        return totalPrice;
    }

    @Override
    public double getMonthlyPayment(Vehicle vehicle) {
        double residualValue = getEndingValue(vehicle);
        double capCost = vehicle.getPrice() + getLeaseFee(vehicle);
        double depreciationCost = capCost - residualValue;
        double financeCharge = (capCost + residualValue)*00.04;

        monthlyPayment = (depreciationCost+financeCharge)/36;


        //Depreciation Cost=Cap Cost−Residual Value
        //Finance Charge=(Cap Cost+Residual Value)×Money Factor


        return monthlyPayment;
    }
}
