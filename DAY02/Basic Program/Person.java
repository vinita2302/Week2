class Person{
private String name; 
private int age; 

public Person(String name,int age){
this.name=name; 
this.age=age; 
} 
 public Person(Person another){
 this.name=another.name; 
 this.age=another.age; 
 }  
 public void display(){
 System.out.println("Name: "+ name); 
 System.out.println("Age: "+ age); 
 }
 
 public static void main(String[] args){
 Person p1=new Person("karan",18); 
p1.display(); 

Person p2=new Person(p1); 
p2.display(); 
} 
} 