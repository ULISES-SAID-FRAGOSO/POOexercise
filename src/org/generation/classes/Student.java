package org.generation.classes;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }//constructor 1

   
    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1); // Asignar registro 0 y año 1 por defecto
    }//constructor 2

    
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1); // Asignar registro 0, calificación 0 y año 1 por defecto
    }//constructor 3
    
    public String printFullName(){
        //TODO implement
    	return firstName + " " + lastName;
     }

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if (grade>=60) { 
    		 return true;
    	 }else {
    		 return false;    		 
    	 }
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
         if (isApproved()) {
        	 year += 1;
        	 System.out.println("Congratulations " + printFullName() + " has superado de curso");
         }else {
        	 System.out.println(printFullName() + " no has cumplido con el puntaje minimo para pasar de curso");
         }
		return year;
     }
     
  
    
    
}//class Student