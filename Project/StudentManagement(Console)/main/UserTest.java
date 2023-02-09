package main;
import java.util.List;
import java.util.Scanner;
import dao.StudentDAOlmpl;
import model.Student;
public class UserTest {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
StudentDAOlmpl dao=new StudentDAOlmpl();// Create an instance of StudentDAOImpl
System.out.println("Welcome to Student Management Application");
System.out.println("=========================================");
while(true) // Keep looping until the user chooses to exit
{	
System.out.println("\n1.Add Student \n2.Show All Students  \n3.Delete Student"
			+ " \n4.Update Student\n5.Get Particular student record by id \n6. Exit");
System.out.println("Enter choice");
int ch = sc.nextInt();
switch (ch)   { // Based on user's choice, perform the required action
case 1:	// create a student record
		System.out.println("Add Student");
		System.out.println("Enter admissionNo ");
		int admissionNo=sc.nextInt();
		System.out.println("Enter student name");
		String studentName = sc.next();
		System.out.println("Enter emailid ");
		String email = sc.next();	
		System.out.println("Enter student school name");
		String schoolName= sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter Percentage");
		double percentage= sc.nextDouble();	// Create a Student object with the user input	
Student student = new Student(admissionNo,  studentName, email,schoolName, city,percentage);
		dao.createStudent(student);	// Create a new student record in the database
		break;		// Add the remaining cases for the other options
case 2://get all student details
System.out.println("Show all Student Details ");// Output statement to show the title "Show all Student Details"
List<Student>studentList= dao.getAllStudentsInfo();// Get a list of all students information from the DAO object
//Output statement for admission to student name
System.out.println("admissionNo   studentName    email              schoolName       city         percentage");
System.out.println("=========================================================================================");
for (Student stuList : studentList) {// Loop through the studentList to display information for each student
			System.out.println(stuList);		}
		break;	// Break the loop after the first iteration
		
case 3:// Delete a student record
	System.out.println("Enter existing Admission Number for delete record :");
	int admNo=sc.nextInt();
dao.deleteStudentById(admNo);// Call the deleteStudentById method with the entered admission number as an argument
	break;
case 4:// Update a student record
		System.out.println("Enter existing admissionNo ");
admissionNo=sc.nextInt(); // Read the existing admission number from the console
		System.out.println("Enter new school name for modify ");
schoolName= sc.next();// Read the new school name from the console
		System.out.println("Enter new city for modify ");
		 city = sc.next();// Read the new city from the console
		System.out.println("Enter new Percentage for modify ");
		 percentage= sc.nextDouble();// Read the new percentage from the console
Student s=new Student(admissionNo,schoolName,city,percentage);// Create a new Student object with the updated values	 
dao.updateStudent(s,admissionNo);// Call the updateStudent method with the new Student object and admission number as arguments
		break;
		
case 5: // Retrieve student information by admission number
	System.out.println("Enter existing admissionNo ");
	 admissionNo=sc.nextInt();// Read the admission number from the console
student= dao.getStudentById(admissionNo);// Call the getStudentById method with the entered admission number as an argument
System.out.println("admissionNo   studentName    email              schoolName       city         percentage");// Print headers for each field
System.out.println("=========================================================================================");
 	System.out.println(student);// Print the details of the student
	 		break;
	 
case 6:// Exit the application
	System.out.println("Thank You for using Student management application!!");
    System.exit(0);// Exit the program with a status code of 0
default:// Invalid choice
    	System.out.println("Please Enter valid choice...");
}    }   	}     }
