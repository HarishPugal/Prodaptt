package StudentAssignment.service;

import java.util.List;

import ExceptionNotFound.exception.StudentDataNotFound;
import StudentAssignment.model.Student;

public interface StudentService {
	public String addStudent(Student student) throws  StudentDataNotFound;
	 
	public Student DisplayStudent(int studentid) throws StudentDataNotFound;
	
	public List<Student> DisplayStudentbaseCity(String city)throws StudentDataNotFound;
	
	public List<Student> DisplayStudentbaseName(String name) throws StudentDataNotFound;
	
	public List<Student> DisplayStudentbaseCities(String[] cities)throws StudentDataNotFound;	
	
	List<Student> readStudent() throws StudentDataNotFound;
}
