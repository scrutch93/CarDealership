package com.pluralsight;

import java.io.IOException;

import static com.pluralsight.DealershipFileManager.loadInventory;
import static com.pluralsight.DealershipFileManager.writeFile;

public class CarDealership {
    public static void main(String[] args) throws IOException {

        // UserInterface.processGetAllVehiclesRequest();

        UserInterface.processGetByYearRequest();



    }
}