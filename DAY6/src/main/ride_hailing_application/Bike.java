package main.ride_hailing_application;

public class Bike extends Vehicle{

    Bike(int vehicleId,String name,double ratePerKm){
       super(vehicleId,name,ratePerKm);

    }
    @Override
    double calculateFare(double distance) {
        return distance*ratePerKm*0.08;
    }
}
