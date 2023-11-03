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
//    public ArrayList<Vehicle> getVehicleByPrice(double min, double max){
//
//    }
//    public ArrayList<Vehicle> getVehicleByMakeModel(String model,String make){
//
//    }
//    public ArrayList<Vehicle> getVehicleByYear(int minYear, int maxYear){
//
//    }
    public static ArrayList<Vehicle> getVehicleByColor(String color) throws IOException {
        DealershipFileManager.loadInventory();


      for (Vehicle vehicle: inventory){
          if(vehicle.getColor() == color){
              return inventory;
          }
      }
        return null;

    }
//    public ArrayList<Vehicle> getVehicleByMileage(int odometer){
//
//    }
//    public ArrayList<Vehicle> getVehicleByType(String type){
//
//    }
    public static ArrayList getAllVehicles() throws IOException {
        DealershipFileManager.loadInventory();
        for (Vehicle vehicle : inventory){
           // System.out.println(vehicle);

            return inventory;
//                    "VIN: "+ vehicle.getVin()+" | Model: " + vehicle.getModel()+ " | Make: " +vehicle.getMake()+" | Type: "+ vehicle.getType()+
//                    " | Year: "+ vehicle.getYear() +" | Color: " + vehicle.getColor() +" | Odometer: " +vehicle.getOdometer()+" | Price: " + vehicle.getPrice();
//
            //System.out.printf("VIN: %d | Model: %s | Make: %s | Type: %s | Year: %s | Color: %s | Odometer: %s| Price: $%.2f\n",
                  //  vehicle.getVin(), vehicle.getModel(), vehicle.getMake(), vehicle.getType() , vehicle.getYear(), vehicle.getColor(),vehicle.getOdometer(),vehicle.getPrice());
        }
        return null;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(){

    }

}
