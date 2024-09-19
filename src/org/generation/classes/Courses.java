package org.generation.classes;

import java.util.HashMap;
import java.util.Map;

public class Courses {
	String courseName;
    String professorName;
    int year;
    HashMap<String, Integer> enrolledStudents = new HashMap<String, Integer>();
	
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new HashMap<>();
    }//constructor
    
    public void enroll(Student student) {
    	String fullName = student.printFullName();
        if (!enrolledStudents.containsKey(fullName)) {
            enrolledStudents.put(fullName, student.grade);
            System.out.println("El estudiante " + student.printFullName() + " ha sido inscrito en " + courseName);
        }
    }
	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		   String fullName = student.printFullName();
		if (enrolledStudents.containsKey(fullName)) {
			enrolledStudents.remove(fullName);
			System.out.println("El estudiante " + student.printFullName() + " ha sido dado de baja");
			}
	   }

	   public int countStudents(){
	       //TODO implement
	       return enrolledStudents.size();
	   }
	   
	   public int bestGrade(){
	       //TODO implement
		   int bestGrade = 0;
		   for (Integer grade:enrolledStudents.values()) {
			   if (grade>bestGrade) {
				   bestGrade = grade;
			   }
		   }
		   
	       return bestGrade;
	   }
}
