class HotelBooking{ 
private String gusetName; 
private String roomType; 
private int nights; 

//create a default constructor 
public HotelBooking(){
 this.gusetName="Unknown"; 
 this.roomType="Unknown"; 
 this.nights=2; 
 } 
 
 //create a parameterized constructor 
 public HotelBooking(String gusetName,String roomType,int nights){
 this.gusetName=gusetName; 
 this.roomType=roomType; 
 this.nights=nights; 
 }
 //create a copy constructor
public HotelBooking(HotelBooking H){
this.gusetName=H.gusetName; 
this.roomType=H.roomType; 
this.nights=H.nights; 
} 
//display the details 
public void display(){
 System.out.println("Name is: "+ gusetName); 
 System.out.println("RoomType is: "+roomType); 
 System.out.println("Nights is: "+nights); 
 
 }

public static void main(String[] args){ 
HotelBooking booking=new HotelBooking(); 
//Display the default constructor  
System.out.println("Display the default constructor"); 
booking.display(); 
HotelBooking booking1=new HotelBooking("karan","normal",3);  
//Display the parameterized constructor
System.out.println("Display the parameterized constructor"); 
booking1.display();  
HotelBooking booking2=new HotelBooking(booking1); 
//Display the copy constructor 
System.out.println("Display the copy constructor");
booking2.display(); 

} 
}
