package com.pluralsight;

import java.io.IOException;

import static com.pluralsight.DealershipFileManager.loadInventory;
import static com.pluralsight.DealershipFileManager.writeFile;

public class CarDealership {
    public static void main(String[] args) throws IOException {

        // UserInterface.processGetAllVehiclesRequest();

       // UserInterface.processGetByYearRequest();

        //UserInterface.processRemoveVehicleRequest();

        Vehicle vehicle = new Vehicle(12,"Accord","Honda","car",2000, "blue", 180000, 3000 );

        SalesContract salesContract = new SalesContract("11/12/2023", "Steven", "stevccru@icloud.com", "Chevy Camaro", 50000,500,true );

      //  salesContract.getMonthlyPayment(vehicle);

        //System.out.println(salesContract.getMonthlyPayment(vehicle));


       // System.out.println(salesContract.getTotalPrice(vehicle));


        UserInterface.saleOption();

    }
}