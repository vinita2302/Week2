class CarRental{
private String customerName; 
private String carModel; 
private int rentalDays;
private double Daily_rate=5.0;  
//create a parameterized constructor
public CarRental(String customerName,String carModel,int rentalDays){
this.customerName=customerName; 
this.carModel=carModel; 
this.rentalDays=rentalDays; 
}  
 
 //calculate the totalCost
double totalCost=0;
public double totalCost(){  
 totalCost=Daily_rate*rentalDays; 
 return totalCost;
 } 
 
 public void display(){
 System.out.println("CustomerName: "+ customerName); 
 System.out.println("CarModel: "+ carModel); 
 System.out.println("RentalDays: "+ rentalDays); 
 System.out.println("TotalCost: "+ totalCost); 
 }

public static void main(String[] args){ 
CarRental car=new CarRental("karan","honda",7); 
//Display the details 

System.out.println("Display the details");
car.display();
} 
}