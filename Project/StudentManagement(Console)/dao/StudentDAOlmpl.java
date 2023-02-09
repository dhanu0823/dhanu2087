package dao;// Implementing all the abstract methods defined in the StudentDAO interface
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Student;// This studentDAO implements contains all the Business logics
import util.DBUtil;
//Declaring a class named StudentDAOImpl that implements the StudentDAO interface
public class StudentDAOlmpl implements StudentDAO{ 
	@Override// Implementing all the abstract methods defined in the StudentDAO interface
public void createStudent(Student student) {
		// This method contains the logic to insert a new student record into the database
String SQL = "INSERT INTO student(admissionNo,studentName,email,"
			+ "schoolName,city,percentage)VALUES(?,?,?,?,?,?)";
		try		{	// Getting a connection to the database
Connection connection = DBUtil.getConnection(); // Creating a prepared statement to execute the SQL insert query		
PreparedStatement ps = connection.prepareStatement(SQL);// Setting the values of the student object to the prepared statement		
			ps.setInt(1,student.getAdmissionNo());
			ps.setString(2, student.getStudentName());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getSchoolName());
			ps.setString(5, student.getCity());
	ps.setDouble(6, student.getPercentage());
  int executeUpdate = ps.executeUpdate();// Executing the prepared statement and getting the number of affected rows		
		if(executeUpdate ==1){  // If one row was affected, the student record was saved successfully
			System.out.println("Student record Saved..");
			}
		} catch (Exception e) {// If an exception occurs, print the stack trace
			e.printStackTrace();
		} //the inserted record is saved
		
	}
	@Override // This method contains the logic to retrieve a student record from the database by its admission number
	public Student getStudentById(int admissionNo) {
		// If i want only the particular record  to be display, we used getStudentById
		Student student = null;
		String SQL = "SELECT *FROM student WHERE admissionNo=?";
		try{ // Getting a connection to the database
		Connection connection = DBUtil.getConnection();
PreparedStatement ps = connection.prepareStatement(SQL);// Creating a prepared statement to execute the SQL select query	
ps.setInt(1, admissionNo);// Setting the admission number value to the prepared statement	
ResultSet rs = ps.executeQuery();// Executing the prepared statement and getting the result set
if (rs.next()) {// If a student record was found, create a new Student object and set its properties from the result set
				int admNo = rs.getInt("admissionNo");
				String studentName = rs.getString("studentName");
				String email = rs.getString("email");
				String schoolName = rs.getString("schoolName");
				String city = rs.getString("city");
				Double percentage = rs.getDouble("percentage");
				student = new Student();
				student.setStudentName(studentName);
				student.setEmail(email);
				student.setCity(city);
				student.setSchoolName(schoolName);
				student.setPercentage(percentage);		}
else { System.out.println("Sorry given student admission number is not found"); }
		} catch (Exception e) {// If an exception occurs, print the stack trace
			e.printStackTrace();		}	
		return student;    	} 	
	// Method to update a student's record in the database	
	public void updateStudent(Student student,int admno)
	{// SQL statement to update student record
	String SQL = "UPDATE student set schoolName=?,city=?,percentage=? WHERE admissionNo=?";
		try
		{// Establish a database connection
		Connection connection = DBUtil.getConnection();
PreparedStatement ps = connection.prepareStatement(SQL);// Prepare a statement from the SQL statement
//Set values for the prepared statement
ps.setString(1, student.getSchoolName());// Set school name
			ps.setString(2, student.getCity()); // Set city
			ps.setDouble(3, student.getPercentage());// Set percentage
			ps.setInt(4,admno);// Set admission number
int executeUpdate = ps.executeUpdate();	// Execute the update operation in the database		
			if(executeUpdate ==1)   {// Check if the update was successful			
			System.out.println("Student Record updated with "+student.getAdmissionNo());		}
			else {System.out.println("Admission number is not available in our system, please check "); }
		} catch (Exception e) {  // Print the stack trace of the exception
			e.printStackTrace();
		}
	} 

	@Override  // Method to delete a student record from the database based on admission number
public void deleteStudentById(int admissionNo) {// SQL DELETE statement to delete the student record with matching admission number
String SQL = "DELETE FROM student WHERE admissionNo=?";
		try { // Establish a connection to the database
		Connection connection = DBUtil.getConnection();
PreparedStatement ps = connection.prepareStatement(SQL);// Prepare a statement using the connection and the SQL DELETE statement		
ps.setInt(1,admissionNo);// Set the value of the admission number in the prepared statement	
int executeUpdate = ps.executeUpdate();// Execute the statement and get the number of rows affected		
if(executeUpdate ==1){// If the number of rows affected is 1, print a message indicating success 
		System.out.println("Student record deleted with :"+admissionNo);   }
else { System.out.println("Given Admission number is not available in our system"); }
		} catch (Exception e) {// If an exception occurs, print the stack trace of the exception
			e.printStackTrace();
		} 	}

	@Override // Method to get information of all students
	public List<Student> getAllStudentsInfo() {
List<Student> studentList = new ArrayList<>();// List to store information of all students
String SQL = "SELECT *FROM student";// SQL statement to retrieve information of all students
		try { // Establish a database connection
		Connection connection = DBUtil.getConnection();
PreparedStatement ps = connection.prepareStatement(SQL);// Prepare a statement from the SQL statement			
		ResultSet rs = ps.executeQuery();// Execute the query and get the result set
while (rs.next()) {// Loop through the result set and get information of each student
	// Get admission number, student name, email, school name, city, and percentage of each student
				int admNo = rs.getInt("admissionNo");
				String studentName = rs.getString("studentName");
				String email = rs.getString("email");
				String schoolName = rs.getString("schoolName");
				String city = rs.getString("city");		
				Double percentage = rs.getDouble("percentage");	
				Student student = new Student();// Create a new student object
				student.setAdmissionNo(admNo);// Set information of the student
				student.setStudentName(studentName);
				student.setCity(city);
				student.setEmail(email);
				student.setSchoolName(schoolName);
				student.setPercentage(percentage);
	studentList.add(student); }	// Add the student information to the list
		} catch (Exception e) {
			e.printStackTrace(); }// Print the stack trace of the exception
		return studentList;// Return the list of students information
		}     }
