package com.app.newfeatures8;

import java.util.ArrayList;
import java.util.List;

public class Developer {
	
	private String name;
	private double salary;
	private int age;
	public Developer(String name, double salary, int age) {
		
		this.name=name;
		this.salary=salary;
		this.age=age;
		
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Deveoper [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	public static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 70000, 33));
		result.add(new Developer("alvin", 80000, 20));
		result.add(new Developer("jason", 100000, 10));
		result.add(new Developer("iris", 170000, 55));
		
		return result;

	}
	
}
