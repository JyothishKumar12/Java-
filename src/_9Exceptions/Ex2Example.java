package _9Exceptions;

public class Ex2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		div();
	}
	
	
	public static void div() {
		int a,b,div;
		a =12;
		b=0;
		try {
			div=a/b;
			System.out.println(div);
		}
	 catch(Exception e){
		 System.out.println(e.getMessage());
		 throw e;
	 }
		finally {
			System.out.println("completed");
		}
		
	}

}
