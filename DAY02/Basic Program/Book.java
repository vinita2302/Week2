class Book{ 
   
 private String title; 
 private String author; 
 private double price;

//Default constructor
 
public Book(){ 
this.title="Unknown Title"; 
this.author="Unknown author"; 
this.price=0.0; 
}  
//Parameterized constructor 
public Book(String title,String author,double price){
this.title=title; 
this.author=author; 
this.price=price; 
} 
 
//Display the details 
public void display(){
System.out.println("Title is: "+title); 
System.out.println("Author is: "+author); 
System.out.println("Price is: "+price); 
}

public static void main(String[] args){
Book b1=new Book(); 
//display the default constructor 
System.out.println("display the default constructor");
b1.display(); 
Book b2=new Book("life is a game","Owned",0.0);  
//display the parameterized constructor 
System.out.println("display the parameterized constructor");
b2.display(); 
} 
} 