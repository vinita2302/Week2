class Product{ 
private String productName; 
private double price; 
private static int totalProducts=0;  

public Product(String productName,double price){
this.productName=productName; 
this.price=price; 
totalProducts++; 
}  

//display the product details 
public void displayProductDetails(){
System.out.println("Product name: "+productName); 
System.out.println("Price :"+price); 
} 

//create a method to display the total number of the product 
public void displayTotalProducts(){
System.out.println("Total Products: "+ totalProducts); 
} 

public static void main(String[] args){
 Product product1=new Product("Laptop",1200.00); 
 Product product2=new Product("SmartPhone",1400.00); 
 Product product3=new Product("Watch",700.00); 
 System.out.println("Display the product1 details");
 product1.displayProductDetails(); 
System.out.println("Display the product3 details"); 
product3.displayProductDetails();

 System.out.println("Display the product2 details");
 product2.displayProductDetails(); 
 System.out.println("Display the totalProducts of product2"); 
 product2.displayTotalProducts(); 

 } 
 }
