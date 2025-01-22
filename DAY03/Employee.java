class Employee{
public static String companyName="Codehelp"; 
private String name; 
private final int id; 
private String designation;   
public static int totalEmployee=0; 
 
 public Employee(String name,int id,String designation){
 this.name=name; 
 this.id=id; 
 this.designation=designation;  
 totalEmployee++;
 } 
 
 public static void displayTotalEmployees(){
 System.out.println("The totalNumber of employees are: "+totalEmployee); 
 } 
 public void displayDetails(){
 if(this instanceof Employee){  
 System.out.println("CompanyName :"+companyName);
 System.out.println("Name :"+name); 
 System.out.println("id :"+id); 
 System.out.println("designation :"+designation); 
 }
 else{
System.out.println("Invalid object type.");  
 } 
 } 
 
 public static void main(String[] args){
	 Employee emp1=new Employee("karan",123,"manager"); 
	 Employee emp2=new Employee("riya",345,"employee"); 
	 
	 //display the details 
	 emp1.displayDetails(); 
	 emp2.displayDetails(); 
	 
	 System.out.println("Display the total number of employees");
	 //display the total number of employees 
	 Employee.displayTotalEmployees(); 
 } 
}
	 

