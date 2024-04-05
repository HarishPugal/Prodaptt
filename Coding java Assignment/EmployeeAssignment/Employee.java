package EmployeeAssignment;

public class Employee {
		private int emp_id;
		private String emp_name;
		private String city;
		
		public Employee(int empid, String empname, String city) {
			super();
			this.emp_id = empid;
			this.emp_name = empname;
			this.city = city;
		}
	 
		public Employee() {
			super();
		}
	 
		public int getEmpid() {
			return emp_id;
		}
	 
		public void setEmpid(int empid) {
			this.emp_id = empid;
		}
	 
		public String getEmpname() {
			return emp_name;
		}
	 
		public void setEmpname(String empname) {
			this.emp_name = empname;
		}
	 
		public String getCity() {
			return city;
		}
	 
		public void setCity(String city) {
			this.city = city;
		}
	 
		@Override
		public String toString() {
			return "Employee [empid=" + emp_id + ", empname=" + emp_name + ", city=" + city + "]";
		}
		
		
	 
	}

	 


