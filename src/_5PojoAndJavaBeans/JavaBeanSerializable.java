 package _5PojoAndJavaBeans;

import java.io.Serializable;

public class JavaBeanSerializable implements Serializable{

	private String name;
	public int id;
	private int salary;
	
	
	public JavaBeanSerializable() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
