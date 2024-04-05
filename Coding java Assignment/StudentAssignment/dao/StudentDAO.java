package StudentAssignment.dao;
import java.util.ArrayList;
import java.util.List;

import ExceptionNotFound.exception.StudentDataNotFound;
import StudentAssignment.model.*;

public class StudentDAO implements StudentInterfaceDAO{
	
	
	

	private static List<Student> studentlist = new ArrayList<Student>();
	@Override
	public String addStudent(Student student) throws StudentDataNotFound {
		if(student!=null) {
			studentlist.add(student);
			return "Added SucessFully"+student;
		}else {
			throw new StudentDataNotFound("Unable to add student as no data was provided");
		}
	}
 
	@Override
	public Student DisplayStudent(int studentid) throws StudentDataNotFound {
		Student st=null;
		for(Student stud:studentlist) {
			 if(stud.getID()==studentid) {
					st=stud;
				}
		 }
		 if(st==null) {
			 throw new StudentDataNotFound("Invalid id or No Students are available");
		 }
		 return st;
	}

 
	@Override
	public List<Student> DisplayStudentbaseCity(String city) throws StudentDataNotFound {
		List<Student>list1 = new ArrayList<Student>();
		if(city==null) {
			throw new StudentDataNotFound("unable to find students from city as no data was provided");
		}
		for(Student stud:studentlist) {
			if(stud.getCity()==city) {
				list1.add(stud);
			}
		}
		if(list1.isEmpty()){
			 throw new StudentDataNotFound("Invalid id or No Students are available");
		 }
		return list1;
	}
 
	@Override
	public List<Student> DisplayStudentbaseName(String name) throws StudentDataNotFound {
		List<Student>list2 = new ArrayList<Student>();
		if(name==null) {
			throw new StudentDataNotFound("unable to find student name as no data was provided");
		}
		for(Student stud:studentlist) {
			if(stud.getName()==name) {
				list2.add(stud);
			}
		}
		if(list2.isEmpty()){
			 throw new StudentDataNotFound("Invalid name or No Students are available");
		 }
		return list2;
 
	}
 
	@Override
	public List<Student> DisplayStudentbaseCities(String[] cities) throws StudentDataNotFound {
		List<Student>list = new ArrayList<Student>();
		if(cities==null) {
			throw new StudentDataNotFound("unable to find cities names as no data was provided");
		}
		for(String city:cities) {
			for(Student stud:studentlist) {
				if(stud.getCity()==city) {
					list.add(stud);
				}
			}
		}
		if(list.isEmpty()){
			 throw new StudentDataNotFound("Invalid City names or No Students coming from that cities are available");
		 }
		return list;
	}
	@Override
	public List<Student> readStudent() throws StudentDataNotFound {
		// TODO Auto-generated method stub
	if(!studentlist.isEmpty()) {
		return studentlist;
	}else {
		throw new StudentDataNotFound("data not present");
	}
	}
}
 