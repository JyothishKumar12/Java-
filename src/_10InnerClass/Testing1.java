package _10InnerClass;

public class Testing1 {

	private int id =10;
	
	
	public void disPlayId() {
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Testing1 tc1 = new Testing1();
		Testing3Inner t3= tc1.new Testing3Inner();
		t3.checking();
	}
	
	

	public class Testing2Inner{
		int a = 12;
		public void displayInnerID() {
			System.out.println(a);
		}
	}
	
	public class Testing3Inner{
		int b =13;
		
		public void checking() {
		Testing2Inner t = new Testing1.Testing2Inner();
		t.displayInnerID();
		Testing2Inner t5 = new Testing2Inner();
		t5.displayInnerID();
		}
	}	
	
	
	}

