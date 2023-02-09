package dao; // This is the Student Data Access Object interface.
import java.util.List;
import model.Student; 
// It contains methods to create, read, update and delete Student objects from the database.
public interface StudentDAO {
// The createStudent method creates a new Student.
	public abstract void createStudent(Student student);
//The getStudentById method gets a Student by its admission number
	public abstract Student getStudentById(int admissionNo);
// The updateStudentById method updates a Student's details 
	public abstract void updateStudent(Student student,int admno);
// The deleteStudentById method deletes a Student by its admission number
	public abstract void deleteStudentById(int admissionNo);
// The getAllStudentInfo method returns a list of all Students.
	public abstract List<Student> getAllStudentsInfo();
	// interface contains all abstract methods
	// we have to implement these methods in another class
}



