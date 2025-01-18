class BookBorrow{ 
private String title;  
private String author; 
private double price; 
private boolean isAvailable; 
//create a parameterized constructors
public BookBorrow(String title,String author,boolean isAvailable){ 
 this.title=title; 
 this.author=author; 
 this.isAvailable=isAvailable; 
 }  
 //Display book is borrow or not
 public void borrow(){
 if(isAvailable==true){ 
  isAvailable = false;
 System.out.println("We can borrow the book"); 
 }else{
 System.out.println("we can't borrow the book");
 }
 }


public static void main(String[] args){
  BookBorrow b1=new BookBorrow("Life Happiness","Owned",true);  
  //display the result 
   b1.borrow(); 
   b1.borrow();
   }
  }