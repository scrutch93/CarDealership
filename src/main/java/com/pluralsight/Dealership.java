package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dealership {


    private String name;
    private String address;
    private String phone;

    static ArrayList<Vehicle> inventory = new ArrayList<>();
    public Dealership(String name, String address, String phone ){
        this.name=name;
        this.address= address;
        this.phone= phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public static ArrayList<Vehicle> getVehicleByPrice(double min, double max) throws IOException {
        DealershipFileManager.loadInventory();
        ArrayList<Vehicle> priceList = new ArrayList<>();
        for (Vehicle vehicle: inventory) {
            if (vehicle.getPrice()>= min && vehicle.getPrice() <=max ) {
                priceList.add(vehicle);
            }
        }
        return priceList;
    }
    public static ArrayList<Vehicle> getVehicleByMakeModel(String model,String make) throws IOException {
        DealershipFileManager.loadInventory();
        ArrayList<Vehicle> thisList = new ArrayList<>();


        for (Vehicle vehicle: inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                thisList.add(vehicle);
            }
        }
        return thisList;

    }
    public static ArrayList<Vehicle> getVehicleByYear(int minYear, int maxYear) throws IOException {
        DealershipFileManager.loadInventory();
        ArrayList<Vehicle> yearList = new ArrayList<>();
        for (Vehicle vehicle: inventory) {
            if (vehicle.getYear()>= minYear && vehicle.getYear() <=maxYear ) {
                yearList.add(vehicle);
            }
        }
        return yearList;
    }
    public static ArrayList<Vehicle> getVehicleByColor(String color) throws IOException {
        DealershipFileManager.loadInventory();
        ArrayList<Vehicle> colorList = new ArrayList<>();


        for (Vehicle vehicle: inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                colorList.add(vehicle);
            }
        }
        return colorList;
    }
    public static ArrayList<Vehicle> getVehicleByMileage(int minOdometer,int maxOdometer) throws IOException {
        DealershipFileManager.loadInventory();
        ArrayList<Vehicle> mileageList = new ArrayList<>();
        for (Vehicle vehicle: inventory) {
            if (vehicle.getYear()>= minOdometer && vehicle.getYear() <=maxOdometer ) {
                mileageList.add(vehicle);
            }
        }
        return mileageList;
    }
    public static ArrayList<Vehicle> getVehicleByType(String type) throws IOException {
        DealershipFileManager.loadInventory();
        ArrayList<Vehicle> typeList = new ArrayList<>();


        for (Vehicle vehicle: inventory) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                typeList.add(vehicle);
            }
        }
        return typeList;

    }
    public static ArrayList<Vehicle> getAllVehicles() throws IOException {
        DealershipFileManager.loadInventory();
        return inventory;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public static void removeVehicle(Vehicle vehicle){ //???
        inventory.remove(vehicle);

    }

}