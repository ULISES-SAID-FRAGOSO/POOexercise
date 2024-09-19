package org.generation;
import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	    public static void main(String[] args) {
	        Student student1 = new Student("Ulises", "Fragoso", 1234, 70, 1);
	        Student student2 = new Student("Ana", "García", 5678, 55, 1);

	        Courses course = new Courses("Matemáticas", "Dr. Smith", 2024);
	        course.enroll(student1);
	        course.enroll(student2);
	        System.out.println("\nEstudiantes inscritos: " + course.countStudents());

	        student1.changeYearIfApproved();
	        student2.changeYearIfApproved();
	        System.out.println("\nLa mejor calificación es: " + course.bestGrade());
	        
	        course.unEnroll(student2);
	        
		
		
	}//main
 
}//class Main
