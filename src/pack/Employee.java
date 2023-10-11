package pack;

public class Employee {

	int id;
	String name,dept,city;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String dept, String city) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.city = city;
	}
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", city=" + city + "]";
	}
}
