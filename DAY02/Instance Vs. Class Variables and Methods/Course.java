class Course{ 
private String courseName; 
private int duration; 
private double fee; 
private static String instituteName="Tech Academy"; 

public Course(String courseName,int duration,double fee ){ 
 this.courseName=courseName; 
 this.fee=fee;  
 this.duration=duration; 
 } 
 
 public void displayCourseDetails(){
 System.out.println("Name of the course: "+courseName); 
 System.out.println("Duration of the course: "+duration); 
 System.out.println("Fee of the course: "+fee);  
 System.out.println("Name of the instituteName is: "+instituteName);
 } 
 public static void updateInstituteName(String newinstituteName){ 
 instituteName=newinstituteName; 
 }
 
public static void main(String[] args){
Course course1=new Course("Java Programing",8,500.00); 
Course course2=new Course("Web development",12,700.00); 

 // Display details of each course
course1.displayCourseDetails(); 
course2.displayCourseDetails(); 

Course.updateInstituteName("Code Academy"); 

course1.displayCourseDetails(); 
course2.displayCourseDetails(); 
} 
}