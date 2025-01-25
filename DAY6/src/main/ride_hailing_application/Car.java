package main.ride_hailing_application;

class Car extends Vehicle{

  Car(int vehicleId,String name,double ratePerKm){
        super(vehicleId,name,ratePerKm);

    }

    @Override
    double calculateFare(double distance) {
       return distance*ratePerKm;
    }


}
