package assignment;

public class _1ifMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks =86;
		
		if(marks<35) {
			System.out.println("fail");
		}else if(marks==35) {
			System.out.println("pass");
		}
		else if(marks>35 && marks<70) {
			System.out.println("3rd class");
		}else if(marks>=70 && marks<85) {
			System.out.println("Second class");
		}else if(marks>85) {
			System.out.println("1 st class");
		}

	}

}
