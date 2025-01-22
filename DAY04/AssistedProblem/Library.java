 import java.util.*; 
 
 class Library{
 
 ArrayList<Book> ListOFBooks=new ArrayList<Book>(); 
 public void addBook(Book bookName){
 ListOFBooks.add(bookName); 
 } 
 public void displayBookDetails(){
 for(int i=0;i<ListOFBooks.size();i++){
 System.out.println("Book: "+ListOFBooks.get(i).title+"Author :"+ListOFBooks.get(i).author); 
 } 
 } 
 }
 class Book{
 public String title; 
 public String author; 
 
 public Book(String title,String author){
 
 this.title=title; 
 this.author=author; 
 
 } 
 } 
 public class LibraryManagement{
 public static void main(String[] args){
 Library library=new Library(); 
 
 Book book1=new Book("Too Good to be True","Prajkta Kohli" ); 
 Book book2=new Book("Atomic Habbits","James Tata"); 
 
 library.addBook(book1); 
 library.addBook(book2); 
  
  library.displayBookDetails(); 
  } 
  }