package emp;

import javax.management.loading.PrivateClassLoader;

public class Person {
	private String name;
	private double height; 
	private int weight;
	

	public Person() {
		System.out.println("Initiated");
	}


	public String getName() {
		return "this is "+name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	

}
