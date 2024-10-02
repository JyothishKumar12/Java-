package ecommerce_JDBC;

import java.util.Scanner;

public class Registration {
	
String name;
int age;
String email;
String password;

public Registration() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	this.name = sc.next();
	System.out.println("Enter age");
	this.age = sc.nextInt();
	System.out.println("Enter email");
	this.email= sc.next();
	System.out.println("Enter password");
	this.password= sc.next();
	sc.close();		
	
}
}
