package com.pluralsight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.Dealership.inventory;

public class UserInterface {
    static Scanner myScanner = new Scanner(System.in);
    Dealership dealership= new Dealership("SA Motors","Charlotte, NC", "1-800-5555");

    public UserInterface(){

    }
    public void display(){

    }
    public static void processGetByPriceRequest() throws IOException {
        System.out.println("Enter the Minimum Price: ");
        double min = myScanner.nextDouble();
        System.out.println("Enter the Maximum Price: ");
        double max = myScanner.nextDouble();

        ArrayList<Vehicle> byPrice = Dealership.getVehicleByPrice(min,max);
        for (Vehicle vehicle: byPrice){

            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");

        }
    }
    public static void processGetByMakeModelRequest() throws IOException {
        System.out.println("Enter the make: ");
        String make = myScanner.nextLine();

        System.out.println("Enter the model: ");
        String model = myScanner.nextLine();

        ArrayList<Vehicle> byMakeModel = Dealership.getVehicleByMakeModel(model,make);
        for (Vehicle vehicle: byMakeModel){
            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");

        }
    }
    public static void processGetByYearRequest() throws IOException {
        System.out.println("Enter the Minimum Year: ");
        int minYear = myScanner.nextInt();
        System.out.println("Enter the Maximum Year: ");
        int maxYear = myScanner.nextInt();

        ArrayList<Vehicle> byYear = Dealership.getVehicleByMileage(minYear,maxYear);
        for (Vehicle vehicle: byYear){

            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");

        }
    }
    public static void processGetByColorRequest() throws IOException {
        System.out.println("Enter the color: ");
        String color = myScanner.nextLine();

        ArrayList<Vehicle> byColor = Dealership.getVehicleByColor(color);
        for (Vehicle vehicle: byColor){
            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");

        }
    }
    public static void processGetByMileageRequest() throws IOException {
        System.out.println("Enter the Minimum Mileage: ");
        int minOdometer = myScanner.nextInt();
        System.out.println("Enter the Maximum Mileage: ");
        int maxOdometer = myScanner.nextInt();

        ArrayList<Vehicle> byMileage = Dealership.getVehicleByMileage(minOdometer,maxOdometer);
        for (Vehicle vehicle: byMileage){

            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");

        }
    }
    public static void processGetByVehicleTypeRequest() throws IOException {
        System.out.println("Enter the type: ");
        String type = myScanner.nextLine();

        ArrayList<Vehicle> byType = Dealership.getVehicleByType(type);
        for (Vehicle vehicle: byType){
            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");

        }
    }
    public static void processGetAllVehiclesRequest() throws IOException {
        ArrayList<Vehicle> all = Dealership.getAllVehicles();
        for (Vehicle vehicle: all) {
            System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                    " | Year: " + vehicle.getYear() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getOdometer() + " | Price: " + vehicle.getPrice() + "\n");
        }

    }
    public static void processAddVehicleRequest(){

    }
    public static void processRemoveVehicleRequest(){

    }

}