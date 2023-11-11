package com.pluralsight;

import javax.annotation.processing.Filer;
import java.io.*;

public class DealershipFileManager {


    static Dealership dealership= new Dealership("SA Motors","Charlotte, NC", "1-800-5555");

    public static void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/resources/Inventory.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        bufferedWriter.close();
    }


    public static String loadInventory() throws IOException {

        FileReader fileReader = new FileReader("src/main/resources/Inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;

        String output = null;
        while ((input = bufferedReader.readLine()) != null) {
            String[] vehicle = input.split("\\|");
            //if (!vehicle[0].equals("Name")) {
            int vin = Integer.parseInt(vehicle[0]);
            String model = vehicle[1].trim();
            String make = vehicle[2];
            String type = vehicle[3];
            int year = Integer.parseInt(vehicle[4]);
            String color = vehicle[5];
            int odometer = Integer.parseInt(vehicle[6]);
            double price = Double.parseDouble(vehicle[7]);

            Dealership.inventory.add(new Vehicle(vin, model, make, type, year, color, odometer, price));
            //
            //}
            output = "VIN: " + vin + " | Model: " + model + " | Make: " + make + " | Type: " + type +
                    " | Year: " + year + " | Color: " + color + " | Odometer: " + odometer + " | Price: " + price;
        }

        return output;

    }





//    static FileWriter fileWriter;
//
//
//    static {
//        try {
//            fileWriter = new FileWriter("src/main/resources/Inventory.csv");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    BufferedWriter writer = new BufferedWriter(fileWriter);
//
//
//
//    static FileReader fileReader;
//
//    static {
//        try {
//            fileReader = new FileReader("src/main/resources/Inventory.csv");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    static BufferedReader reader = new BufferedReader(fileReader);


    //    public Dealership getDealership() throws FileNotFoundException {
//
//       // readFile();
//
//        String input;
//
//
//
//
//
//       // return dealership;
//    }
    public void saveDealership(){

    }

}