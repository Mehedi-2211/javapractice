package emp;

import javax.management.loading.PrivateClassLoader;

public class Employee {
	private String name; // Attributes 
	private String id;
	private String designation;
	private double salary;
	private int age;

	public Employee(String name, String id, String designation, double salary, int age) { //Constructor 
      this.name= name; //initial value assign 
      this.id= id;
      this.designation= designation;
      this.salary= salary;
      this.age= age;
      
	}

	public String getName() { //getter method 
		return name;
	}

	public void setName(String name) { //setter method 
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}
	

	public String toString() { //to string method
		return "Employee [name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary
				+ ", age=" + age + "]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
