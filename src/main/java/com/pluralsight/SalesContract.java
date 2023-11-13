package com.pluralsight;

public class SalesContract extends Contract {

    private double salesTax = 00.05;

    private double recordingFee = 100.00;

    private double processingFee;

    private boolean finance;

    private int term;

    public SalesContract(String date, String name, String email, String vehicleSold, double totalPrice, double processingFee, boolean finance) {
        super(date, name, email, vehicleSold, totalPrice);
//        this.salesTax = salesTax;
//        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee(Vehicle vehicle) {
       // Vehicle vehicle = new Vehicle(12,"Accord","Honda","car",2000, "blue", 180000, 3000 );

        if (vehicle.getPrice() <= 10000){

            processingFee = 295.00;

        }else {
            processingFee = 495.00;
        }
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }


    @Override
    public double getMonthlyPayment(Vehicle vehicle) {
        //Monthly payment = (loan amount) × (interest rate / 12) / (1 − (1 + (interest rate / 12)) ^ (-loan term))


        float interestRate = 0f;
        int months = 0;
        double loanAmount = vehicle.getPrice();


        if(loanAmount >= 10000.00 && isFinance()){

            interestRate = 00.0425f;
            months += 48;



        }else if (loanAmount < 10000.00 && isFinance()){

            interestRate = 00.0525f;
            months += 24;

        }else if(!isFinance()){

            return 0;
        }

        monthlyPayment = (loanAmount * (interestRate / 12.0)) / (1 - Math.pow(1 + (interestRate / 12.0), -months));

         term = months;

        return monthlyPayment;
    }
    @Override
    public double getTotalPrice(Vehicle vehicle) {

        int months = 0;
        double monthlyPayment = getMonthlyPayment(vehicle);
        double processingFee = getProcessingFee(vehicle);

        if(isFinance()){

            if(vehicle.getPrice() >= 10000){

                months = 48;
            }else{
                months = 24;
            }

            totalPrice =  ((months*monthlyPayment) + getRecordingFee() + processingFee);

            totalPrice += totalPrice * getSalesTax();
        }else {

            totalPrice = vehicle.getPrice() + getRecordingFee() + processingFee;
        }



        return totalPrice;
    }
}
