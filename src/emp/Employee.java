package emp;

import javax.management.loading.PrivateClassLoader;

public class Employee {
	private String name;
	private String id;
	private String designation;
	private double salary;
	private int age;

	public Employee(String name, String id, String designation, double salary, int age) {
      this.name= name;
      this.id= id;
      this.designation= designation;
      this.salary= salary;
      this.age= age;
      
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
