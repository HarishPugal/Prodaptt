package StudentAssignment.service;
import StudentAssignment.dao.*;
import StudentAssignment.model.Student;

import java.util.List;

import ExceptionNotFound.exception.StudentDataNotFound;



public class StudentServiceImpl implements StudentService {

	@Override
	public String addStudent(Student student) throws StudentDataNotFound {
		StudentInterfaceDAO stud= new StudentDAO();
		return stud.addStudent(student);
	}

	@Override
	public Student DisplayStudent(int studentid) throws StudentDataNotFound {
		StudentInterfaceDAO stud= new StudentDAO();
		return stud.DisplayStudent(studentid);
	}

	@Override
	public List<Student> DisplayStudentbaseCity(String city) throws StudentDataNotFound {
		StudentInterfaceDAO stud= new StudentDAO();
		return stud.DisplayStudentbaseCity(city);
	}

	@Override
	public List<Student> DisplayStudentbaseName(String name) throws StudentDataNotFound {
		StudentInterfaceDAO stud= new StudentDAO();
		return stud.DisplayStudentbaseName(name);
	}

	@Override
	public List<Student> DisplayStudentbaseCities(String[] cities) throws StudentDataNotFound {
		StudentInterfaceDAO stud= new StudentDAO();
		return stud.DisplayStudentbaseCities(cities);
	}

	@Override
	public List<Student> readStudent() throws StudentDataNotFound {
		StudentInterfaceDAO stud= new StudentDAO();
		return stud.readStudent();
	}

	
}