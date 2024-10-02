package classProblems;

class Employee{
	public String name;
	int salary;
	protected int id;
	
	public Employee(String name,int salary,int id) {
		this.name =name;
		this.salary =salary;
		this.id =id;
	}
	public void displayDetails() {
		System.out.println("Name :"+ name+ "," +" id :" +id);
	}
	
	public int salaryHike(int percent) {
		return (salary*percent)/100;
	}
}

class Manager extends Employee{

	int bonus;
	public Manager(String name, int salary, int id,int bonus) {
		super(name, salary, id);
		this.bonus=bonus;
	}
	
	
	public int  managerSalary() {
		return super.salaryHike(bonus);
	}
}



public class _6Inheritance {
 public static void main(String[] args) {
	
//	 Employee e1 = new Employee("st",3456,7);
//	 e1.displayDetails();
//	System.out.println(e1.salaryHike(4));
	 
	 Manager m1 = new Manager("ER",3452,2,5);
	 System.out.println(m1.managerSalary());
}
}
