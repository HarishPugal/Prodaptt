package StudentAssignment.dao;

import java.util.List;
import ExceptionNotFound.exception.*;

import StudentAssignment.model.Student;

public interface StudentInterfaceDAO {
	
	public String addStudent(Student student) throws StudentDataNotFound;
	 
	public Student DisplayStudent(int studentid) throws StudentDataNotFound;
	
	public List<Student> DisplayStudentbaseCity(String city)throws StudentDataNotFound;
	
	public List<Student> DisplayStudentbaseName(String name) throws StudentDataNotFound;
	
	public List<Student> DisplayStudentbaseCities(String[] cities) throws StudentDataNotFound;
 
	List<Student> readStudent() throws StudentDataNotFound;
}