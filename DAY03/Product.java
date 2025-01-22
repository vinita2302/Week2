class Product{
private double discount=0.0; 
private String productName; 
private double price; 
private int quantity; 
private final int productId; 

 public Product(String productName,double price,int quantity,int productId){
 this.productName=productName;  
 this.price=price;
 this.productId=productId; 
 this.quantity=quantity; 
 }  
 
 
 public static void updateDiscount(int newdiscount){
	 this.discount=newdiscount; 
 }
 public void displayDetails(){ 
 if(this instanceof Product){
 System.out.println("ProductName :"+productName); 
 System.out.println("Price :"+price); 
 System.out.println("Quantity :"+quantity); 
 System.out.println("Id :"+productId); 
 }else{
	System.out.println("Invaild object type!"); 	
 } 
 } 
 
 public static void main(String[] args){
 Product product1=new Product("Pen",5.0,2,10); 
 Product product2=new Product("Book",60.0,10,20);  
 
 System.out.println("Display the details"); 
 product1.displayDetails(); 
 product2.displayDetails(); 
 
 System.out.println("Display the updateDiscount"); 
 
  Product.updateDiscount(5.0);
 } 
 }