package _5PojoAndJavaBeans;


//import com.graphbuilder.struc.LinkedList;

public class Pojo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Pojo e1 = new Employee_Pojo();
		e1.id=1;
		e1.setName("Mt");
		e1.setSalary(34567);
		
		Employee_Pojo e2 = new Employee_Pojo();
		e2.id=2;
		e2.setName("st");
		e2.setSalary(50000);

		
		Employee_Pojo [] em = new Employee_Pojo[] {e1,e2};
		
		for(Employee_Pojo e: em) {
			System.out.println(e.getName());
		}

}
}
