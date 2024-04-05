package EmployeeAssignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	
	public static List<Employee> employeeslist= new ArrayList<Employee>();
	
		public void addEmployee(Employee employee) {
			if(employee!=null) {
				employeeslist.add(employee);
				System.out.println("The new employee added with employee id "+employee.getEmpid()+"Sucessfully");
			}
			else {
				System.out.println("No data was founded");
			}
			}
		
		public Employee getEmployee(int emp_id) {
			Employee st=null;
			for(Employee emp:employeeslist) {
				 if(emp.getEmpid()==emp_id) {
						st=emp;
					}
			 }
			 if(st==null) {
				 System.out.println("No Employee was found");
			 }
			 return st;
		}
		public List<Employee> readallEmployee() {
			return employeeslist;
			
		}
	 
	}


