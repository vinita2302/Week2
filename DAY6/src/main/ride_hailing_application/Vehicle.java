package main.ride_hailing_application;

  abstract public class Vehicle {
    private final int vehicleId;
    String name;
    double ratePerKm;
    private String currentLocation;

    Vehicle(int vehicleId,String name,double ratePerKm){
        this.vehicleId=vehicleId;
        this.name=name;
        this.ratePerKm=ratePerKm;
    }

      public int getVehicleId() {
          return vehicleId;
      }
      public String getCurrentLocation(){
        return currentLocation;
      }

      public void updateLocation(String location){
        this.currentLocation=location;
      }

      abstract double calculateFare(double distance);

    public String getVehicleDetails(){
        return "vehicleId: " + vehicleId + ", name: " + name + ", ratePerKm: " + ratePerKm;


    }

  }
