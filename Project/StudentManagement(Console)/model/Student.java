package model;  // Student class contains properties for student details
public class Student {
	private int admissionNo;  // Admission number of the student
	private String studentName; // Name of the student
	private String email;  // Email of the student
	private String schoolName; // School name of the student
	private String city;  // City where the student lives
	private double percentage; // Percentage of marks obtained by the student
	// Getters and setters are used to protect your data, particularly when creating classes
	public int getAdmissionNo() { // Getter method for admission number
		return admissionNo;}
	public void setAdmissionNo(int admissionNo) {// Setter method for admission number
		this.admissionNo = admissionNo;}
	public String getStudentName() { // Getter method for student name
		return studentName;   }
	public void setStudentName(String studentName) { // Setter method for student name
		this.studentName = studentName;    }
	public String getSchoolName() { // Getter method for school name
		return schoolName;    }
	public void setSchoolName(String schoolName) { // Setter method for school name
		this.schoolName = schoolName;
	}
	public String getCity() {  // Getter method for city
		return city;    }
	public void setCity(String city) { // Setter method for city
		this.city = city;     }
	public double getPercentage() { // Getter method for percentage
		return percentage;     }
	public void setPercentage(double percentage) {  // Setter method for percentage
		this.percentage = percentage;   }
	public Student() { // No-argument constructor
		super();  }// Call to the superclass's constructor 
		// Instance variable for storing the email address// TODO Auto-generated constructor stub 
	public String getEmail() {   // Getter method for email
		return email;       	} // Return the value of the email instance variable
	public void setEmail(String email) {  // Setter method for email
		this.email = email;     } // Update the value of the email instance variable
	public Student(int admissionNo, String studentName, String email, String schoolName,
	String city, double percentage) { // Constructor with five parameters
		this.admissionNo = admissionNo; // Initialize the admissionNo instance variable
		this.studentName = studentName; // Initialize the studentName instance variable
		this.email = email;  // Initialize the email instance variable
		this.schoolName = schoolName; // Initialize the schoolName instance variable
		this.city = city; // Initialize the city instance variable
		this.percentage = percentage;     }// Initialize the percentage instance variable
	// toString method to return a string representation of the object
	@Override  
	public String toString() { // Return a string representation of the object
return "\n"+ admissionNo + " \t     "+ studentName +"          "+ 
email+"     " + schoolName + " \t      " + city + "         " + percentage;}
	// Constructor with four parameters
	public Student(int admissionNo, String schoolName, String city, double percentage) {	
		this.admissionNo = admissionNo;// Initialize the admissionNo instance variable
		this.schoolName = schoolName;// Initialize the schoolName instance variable
		this.city = city;// Initialize the city instance variable
		this.percentage = percentage;}    }// Initialize the percentage instance variable
		
	
