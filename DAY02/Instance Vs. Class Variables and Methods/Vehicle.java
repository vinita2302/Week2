class Vehicle{ 
private String ownerName; 
private String vehicleType; 
private  static double registrationFee=1700.00; 

public Vehicle(String ownerName,String vehicleType){ 
this.ownerName=ownerName; 
this.vehicleType=vehicleType; 

} 

//create a method to display  vehicle details 
public void displayVehicleDetails(){
System.out.println("owner Name: "+ownerName); 
System.out.println("vehicleType: "+vehicleType); 
System.out.println("Registration Fee: $"+registrationFee); 
} 
//create a method to change the registrationFee 
public static void updateRegistrationFee(double newRegistrationFee){
registrationFee=newRegistrationFee; 
}

public static void main(String[] args){ 
Vehicle vehicle1=new Vehicle("Alice" ,"car" ); 
Vehicle vehicle2=new Vehicle("Bob", "MotorCycle"); 

 vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update the registration fee
       Vehicle.updateRegistrationFee(150.00);

        // Display details again to reflect updated registration fee
        System.out.println("\nAfter updating registration fee:\n");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
} 
}
