package StudentAssignment.model;

public class Student {
	private int ID;
	private String Name;
	private String City;
	
	public Student() {
		super();
	}
	public Student(int iD, String name, String city) {
		super();
		ID = iD;
		Name = name;
		City = city;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", City=" + City + "]";
	}
	
	

}
