class Book{
public static String libraryName="Education Wishdom";  
public String title; 
private String author; 
private final int isbn;  
 

public Book(String title,String author,int isbn){
this.title=title; 
this.author=author; 
this.isbn=isbn; 
} 

public static void displayLibraryName(){
System.out.println("Name of the Library is: "+libraryName); 
}  

public void displayDetails() { 
if(this  instanceof Book){
System.out.println("Library name is: "+libraryName);
System.out.println("Title is: "+title); 
System.out.println("Author is: "+author); 
System.out.println("Isbn is: "+isbn);  
}else{
	System.out.println("Invalid object type."); 
}

}
public static void main(String[] args){
Book b1=new Book("Change the life","Calmand",102); 
Book b2=new Book("Big Idea","Alina",134); 

System.out.println("Display the details") ;
b1.displayDetails(); 
b2.displayDetails(); 

System.out.println("Display the libraryName"); 
Book.displayLibraryName(); 
} 
}